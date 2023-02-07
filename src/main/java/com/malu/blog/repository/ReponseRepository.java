package com.malu.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malu.blog.entity.Reponse;

@Repository
public interface ReponseRepository extends JpaRepository<Reponse,Long>{
    
}
