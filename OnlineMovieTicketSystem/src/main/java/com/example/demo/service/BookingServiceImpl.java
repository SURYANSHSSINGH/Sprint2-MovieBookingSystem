package com.example.demo.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BookingDao;
import com.example.demo.dao.MovieDao;
import com.example.demo.exception.EntityAlreadyPresentException;
import com.example.demo.model.Booking;

@Service
@Transactional
public class BookingServiceImpl implements BookingService{

	@Autowired
	private BookingDao bookingDao;
	@Autowired
	private MovieDao movieDao;
	
	
	@Override
	public Booking addBooking(Booking booking) {
		
		return bookingDao.save(booking);
	}
	
	
	@Override
	public String cancelBooking(int bookingId) {
		Optional<Booking> booking =bookingDao.findById(bookingId);
		if(!booking.isPresent()||booking==null) {
			return "No Booking Found For Given Booking Id";
		}
		bookingDao.deleteById(bookingId);
		return "Your Booking Has Been Cancelled";
	}
	
	
}
