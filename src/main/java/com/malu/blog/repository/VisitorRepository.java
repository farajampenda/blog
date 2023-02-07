package com.malu.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malu.blog.entity.Visitor;

@Repository
public interface VisitorRepository extends JpaRepository<Visitor,Long>{
    
}
