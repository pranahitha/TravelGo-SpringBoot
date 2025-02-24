package com.travelgo.irs.exception;

public class InvalidPasswordException extends TravelGoBootException{
	private static final long serialVersionUID = 1L;
	public InvalidPasswordException(String message) {
		super(message);
	}
}
