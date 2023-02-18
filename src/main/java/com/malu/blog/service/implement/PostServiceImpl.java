package com.malu.blog.service.implement;

import java.io.IOException;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.malu.blog.dto.postDto;
import com.malu.blog.entity.Post;
import com.malu.blog.helpers.UploadFile;
import com.malu.blog.repository.PostRepository;
import com.malu.blog.service.PostService; 

@Service
public class PostServiceImpl implements PostService{
 
  @Autowired
  private PostRepository posterepo;

    postDto postdto=new postDto();
    @Override
    public ResponseEntity<?> editPost(postDto dto, MultipartFile[] files, Long postID) { 
        return null;
    }

    @Override
    public ResponseEntity<?> delPost(Long postID) { 
        return null;
    }

    @Override
    public ResponseEntity<?> addPost(postDto dto, MultipartFile[] files) {
     Map<String,Object> data=new LinkedHashMap<>();
        try {
        Post post=postDto.convertToEntity(dto);
        post=posterepo.save(post);
        String uploardDir="image/"+post.getId(); 
        List<String> AllFile=new ArrayList<>();
        for (int i = 0; i < files.length; i++) {
            String fileName = org.springframework.util.StringUtils.cleanPath(files[i].getOriginalFilename());   
            UploadFile.saveFile(uploardDir, fileName, files[i]);
            String file=files[i].getOriginalFilename();
            AllFile.add(file);
            
           
        }
        post.setFile(files.toString());
        StringJoiner fileNames=new StringJoiner("-");
	    	
	  
         for (int i = 0; i < AllFile.size(); i++) {
            fileNames.add(AllFile.get(i));
         }

       post.setFile(fileNames.toString());
       posterepo.save(post);
       data.put("status", 200);
       data.put("data",post.getId());
       data.put("response","enregistrement avec succès");
       return new ResponseEntity<>(data, HttpStatus.ACCEPTED);
       } catch (Exception e) {
        data.put("status", 401); 
       data.put("response","Echec d'enregistrement");
       return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
       } 
     }

    @Override
    public ResponseEntity<Byte[]> getFile() { 
        return null;
    }

    @Override
    public ResponseEntity<?> getOneData(Long postID) { 
        return null;
    }

    @Override
    public ResponseEntity<?> getData() { 
        return null;
    }
    

    public ResponseEntity<List<byte[]>> getFileImage(Long id) throws IOException {
		Post post=posterepo.findById(id).get();
        String fileName=post.getFile();
        String[] allFille=fileName.split("-");
        List<byte[]> image=new ArrayList<>();
        for (int i = 0; i < allFille.length; i++) { 
            String path = "image/" + id + "/" +allFille[i];
	        byte[] imageBytes = UploadFile.getFile(path);   
            image.add(imageBytes);
      //  return ResponseEntity.ok().contentType(MediaType.APPLICATION_PDF).body(imageBytes);
 
        } 
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_PDF).body(image);


	}

    @Override
    public ResponseEntity<List<byte[]>> getFichier(Long id) {
        
        return null;
    }
 
    
}
