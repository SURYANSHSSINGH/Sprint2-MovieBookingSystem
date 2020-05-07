package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Movie;
import com.example.demo.model.Theater;
import com.example.demo.service.MovieService;
import com.example.demo.service.TheaterService;

/*
 * @author-Tushar Tevetia
 */
@RestController
@RequestMapping("/lookintoTheater")
public class TheaterController {

	@Autowired
	private MovieService movieService ;
	
	@Autowired
	private TheaterService theaterService;
	
	//------------------------------------------------Show Movie------------------------------------------------------------
	
	@RequestMapping("/showMovie/{theaterId}/{movieName}")
	public List<Movie> findMovieByTheaterId(@PathVariable("theaterId")int tid,@PathVariable("movieName")String movieName)
	{
		Theater theater = theaterService.findTheaterById(tid) ;
		if(theater.getTheaterId()==tid)
		{
		return movieService.searchMovie(movieName);
	}
		else
			return null;
	
	}
	
	//-------------------------------------------------Show All Theaters---------------------------------------------------
	
	@RequestMapping("/showAllTheater")
	public List<Theater> getAllTheaters(){
		return theaterService.getAllTheaters();
	}
	
	//-------------------------------------------------Show All Movies------------------------------------------------------
	
	@RequestMapping("/showAllMovies")
	public List<Movie> getAllMovies(){
		return movieService.getAllMovies();
	}
}
   