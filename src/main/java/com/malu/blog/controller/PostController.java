package com.malu.blog.controller;

import java.security.Provider.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam; 
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.malu.blog.dto.postDto;
import com.malu.blog.service.PostService;

@RestController
public class PostController {

    @Autowired
    PostService service;

    @GetMapping("/data.api.get")
    public ResponseEntity<?> Posts() {
        return service.getData();
    }

    @GetMapping("/data.api.getOne/{postID}")
    public ResponseEntity<?> PostOne(@PathVariable("postID") Long postID) {
        return  service.getOneData(postID);
    }

    @GetMapping("/data.api.getFile/{postID}")
    public ResponseEntity<Byte[]> PostFile(@PathVariable("postID") Long postID) {
        return service.getFile();
    }

    @PostMapping("/data.api.post")
    public ResponseEntity<?> addData(postDto dto,@RequestParam(required = false) MultipartFile[] files) {
        return service.addPost(dto,files);
        
    }

    @DeleteMapping("/data.api.del/{postID}")
    public ResponseEntity<?> delete(@PathVariable("postID") Long postID) {
        return service.delPost(postID);
        
    }

    @PutMapping("/data.api.put/{postID}")
    public ResponseEntity<?> edit(postDto dto,@RequestParam(required = false) MultipartFile[] files,@PathVariable("postID") Long postID) {
        return service.editPost(dto,files,postID);
        
    }
}
