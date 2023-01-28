package com.joshua.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmployeeNotFoundException  extends RuntimeException{

	public EmployeeNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public EmployeeNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
