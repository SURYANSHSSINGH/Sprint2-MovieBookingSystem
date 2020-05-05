package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Theater;

@Repository
public interface TheaterRepository extends JpaRepository<Theater, Integer>{
    
	
}