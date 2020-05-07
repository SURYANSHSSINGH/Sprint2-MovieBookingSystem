package com.example.demo.service;

import com.example.demo.model.Booking;

public interface BookingService {

	public Booking addBooking (Booking booking);
	
	public String cancelBooking(int bookingId);
}
