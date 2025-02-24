package com.travelgo.irs.exception;

public class InvalidEmailException extends TravelGoBootException{
	private static final long serialVersionUID = 1L;
	public InvalidEmailException(String message) {
		super(message);
	}

}
