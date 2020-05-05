package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="seat")
public class Seat implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int seatId;
	private enum seatStatus {
		blocked,booked;
	}
	private double seatPrice;
	
	
	public Seat(int seatId, double seatPrice) {
		super();
		this.seatId = seatId;
		this.seatPrice = seatPrice;
	}
	public int getSeatId() {
		return seatId;
	}
	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}
	public double getSeatPrice() {
		return seatPrice;
	}
	public void setSeatPrice(double seatPrice) {
		this.seatPrice = seatPrice;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
