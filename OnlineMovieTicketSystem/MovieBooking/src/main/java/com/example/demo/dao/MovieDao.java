package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Movie;

@Repository
public interface MovieDao extends JpaRepository<Movie, Integer>{
	List<Movie> findByMovieName(String movieName);

    
	
}