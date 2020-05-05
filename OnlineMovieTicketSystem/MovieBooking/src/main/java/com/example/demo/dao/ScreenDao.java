package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.model.Screen;

@Repository
public interface ScreenDao extends JpaRepository<Screen, Integer>{
    
	
}