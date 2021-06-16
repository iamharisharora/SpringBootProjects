package com.example.demo.exceptionhandling;

public class ResourceNotFoundException extends Exception {

	private static final long serialVersionUID = -7419943020728112173L;

	public ResourceNotFoundException() {
		super();
	}

	public ResourceNotFoundException(final String message) {
		super(message);
	}

}
