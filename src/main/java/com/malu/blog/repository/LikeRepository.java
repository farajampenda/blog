package com.malu.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malu.blog.entity.Like;

@Repository
public interface LikeRepository extends JpaRepository<Like,Long>{
    
}
