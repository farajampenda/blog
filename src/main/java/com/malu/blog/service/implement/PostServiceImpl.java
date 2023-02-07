package com.malu.blog.service.implement;

import java.util.*;

import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    private PostRepository postRepo;

    postDto postdto=new postDto();
    @Override
    public ResponseEntity<?> editPost(postDto dto, MultipartFile[] files, Long postID) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ResponseEntity<?> delPost(Long postID) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ResponseEntity<?> addPost(postDto dto, MultipartFile[] files) {
     Map<String,Object> data=new LinkedHashMap<>();
        try {
        Post post=postDto.convertToEntity(dto);
        post=postRepo.save(post);
        String uploardDir=post.getType()+"/"+post.getId(); 
        List<String> AllFile=new ArrayList<>();
        for (int i = 0; i < files.length; i++) {
            String fileName = org.springframework.util.StringUtils.cleanPath(files[i].getOriginalFilename());   
            UploadFile.saveFile(uploardDir, fileName, files[i]);
            String file=files[i].getOriginalFilename();
            AllFile.add(file);
           
        }
       for (int i = 0; i < AllFile.size(); i++) {
        post.setFile(AllFile.get(i));
       }

       postRepo.save(post);
       data.put("status", 200);
       data.put("data",post.getId());
       data.put("response","enregistrement avec succès");
       return new ResponseEntity<>(data, HttpStatus.ACCEPTED);
       } catch (Exception e) {
        data.put("status", 401); 
       data.put("response","Echec d'enregistrement");
       return new ResponseEntity<>(data, HttpStatus.ACCEPTED);
       } 
    }

    @Override
    public ResponseEntity<Byte[]> getFile() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ResponseEntity<?> getOneData(Long postID) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ResponseEntity<?> getData() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
