package com.example.demo.exception;

public class EntityAlreadyPresentException extends RuntimeException{
	public EntityAlreadyPresentException(String msg)
	{
		super(msg);
	}

}
