package com.example.demo.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.SeatDao;
import com.example.demo.model.Seat;

@Service
@Transactional
public class SeatServiceImpl implements SeatService{
	
	@Autowired
	private SeatDao seatdao;

	@Override
	public Seat blockSeat(int seatId) {
	//	Optional<Seat>sOptional=seatdao.
		return null;
	}

	@Override
	public Seat bookSeat(int seatId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Seat cancelSeat(int seatId) {
		// TODO Auto-generated method stub
		return null;
	}

}
