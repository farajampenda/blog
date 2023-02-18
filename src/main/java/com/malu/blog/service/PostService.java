package com.malu.blog.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import com.malu.blog.dto.postDto;

public interface PostService {

    ResponseEntity<?> editPost(postDto dto, MultipartFile[] files, Long postID);

    ResponseEntity<?> delPost(Long postID);

    ResponseEntity<?> addPost(postDto dto, MultipartFile[] files);

    ResponseEntity<Byte[]> getFile();

    ResponseEntity<?> getOneData(Long postID);

    ResponseEntity<?> getData();

    ResponseEntity<List<byte[]>> getFichier(Long id);
    
}
