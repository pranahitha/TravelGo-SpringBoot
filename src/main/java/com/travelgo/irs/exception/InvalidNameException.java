package com.travelgo.irs.exception;

public class InvalidNameException extends TravelGoBootException{
	private static final long serialVersionUID = 1L;
	public InvalidNameException(String message) {
		super(message);
	}
}
