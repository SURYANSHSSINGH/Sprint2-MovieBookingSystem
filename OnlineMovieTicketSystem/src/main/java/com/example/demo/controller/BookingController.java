package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Booking;
import com.example.demo.service.BookingService;
import com.example.demo.service.MovieService;
import com.example.demo.service.TheaterService;

@RestController
@RequestMapping("/customer")
public class BookingController {

	
	@Autowired
	private BookingService bookingService;
	@Autowired
	private MovieService movieService;
	@Autowired
	private TheaterService theaterService;
	
	//-------------------------------------------Do Booking-------------------------------------------------------------------
	
	@RequestMapping(value="/booking/doBooking",method=RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public Booking addBooking(@RequestBody Booking booking) {
		return bookingService.addBooking(booking);
	}
	
	//--------------------------------------------Cancel Booking--------------------------------------------------------------
	
	@RequestMapping(value="/booking/cancelbooking/{bookingId}",method=RequestMethod.DELETE)
	public String cancelBooking(@PathVariable("bookingId")Integer bookingId) {
		return bookingService.cancelBooking(bookingId);
	}
}
