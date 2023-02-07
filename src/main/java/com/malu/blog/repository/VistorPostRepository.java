package com.malu.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malu.blog.entity.VistorPost;
 

@Repository
public interface VistorPostRepository extends JpaRepository<VistorPost,Long>{
    
}
