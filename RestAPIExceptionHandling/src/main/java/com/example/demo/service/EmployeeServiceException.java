package com.example.demo.service;

public class EmployeeServiceException extends Exception {

	private static final long serialVersionUID = 8398207958547339355L;

	public EmployeeServiceException() {
		super();
	}

	public EmployeeServiceException(final String message) {
		super(message);
	}

}
