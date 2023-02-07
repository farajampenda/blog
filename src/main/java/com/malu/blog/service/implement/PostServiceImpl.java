package com.malu.blog.service.implement;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.malu.blog.dto.postDto;
import com.malu.blog.service.PostService;

@Service
public class PostServiceImpl implements PostService{

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
        // TODO Auto-generated method stub
        return null;
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
