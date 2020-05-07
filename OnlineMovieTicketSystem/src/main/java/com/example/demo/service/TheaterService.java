package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Theater;

public interface TheaterService {
	
	public Theater addTheater(Theater theater) ;
	
	public String updateTheater(Theater theater) ;
	
	public String deleteTheater(int theaterId) ;
	
	public Theater findTheaterById(int theaterId) ;

	public List<Theater> getAllTheaters();
	
}