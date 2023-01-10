package com.example.rest.webservices.restfulwebservices.user.exception;

import java.time.LocalDateTime;

public class ErrorDetails {
	
	private LocalDateTime TimeStamp;
	private String message;
	private String Details;
	
	public ErrorDetails(LocalDateTime timeStamp, String message, String details) {
		super();
		TimeStamp = timeStamp;
		this.message = message;
		Details = details;
	}

	public LocalDateTime getTimeStamp() {
		return TimeStamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return Details;
	}
	
	
	
}
