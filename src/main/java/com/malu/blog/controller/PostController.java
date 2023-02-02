package com.malu.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
    
    @GetMapping("/dates")
    public String name() {
        return "nom:faraja";
    }
}
