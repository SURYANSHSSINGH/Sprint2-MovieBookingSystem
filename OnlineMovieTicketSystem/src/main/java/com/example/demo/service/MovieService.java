package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Movie;

public interface MovieService {
	
	public String deleteMovie(int id) ;
	public List<Movie> searchMovie(String movieName);
	public List<Movie> getAllMovies();

}