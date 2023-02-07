package com.malu.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malu.blog.entity.Abonnee;

@Repository
public interface AbooneeRepository extends JpaRepository<Abonnee,Long>{
    
}
