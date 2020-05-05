package com.example.demo.service;

import com.example.demo.model.Seat;

public interface SeatService {
	
	public Seat blockSeat(int seatId);
	public Seat bookSeat(int seatId);
	public Seat cancelSeat(int seatId);

}
