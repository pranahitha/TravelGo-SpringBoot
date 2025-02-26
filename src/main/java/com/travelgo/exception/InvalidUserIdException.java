package com.travelgo.exception;

public class InvalidUserIdException extends TravelGoBootException{
	private static final long serialVersionUID = 1L;
	public InvalidUserIdException(String message) {
		super(message);
	}

}
