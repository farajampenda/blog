package com.malu.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malu.blog.entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post,Long>{
    
}
