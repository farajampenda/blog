package com.malu.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malu.blog.entity.Paratge;

@Repository
public interface PartageRepository extends JpaRepository<Paratge,Long>{
    
}
