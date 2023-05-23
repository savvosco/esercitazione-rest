package com.apulia.javaee.restapi.configuration;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.apulia.javaee.restapi.exception.MyCustomException;
import com.apulia.javaee.restapi.utils.ApplicationConstants;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<String> handleAllExceptions(Exception ex, WebRequest request) {

		return new ResponseEntity<>(ApplicationConstants.SERVER_ERROR, HttpStatus.INTERNAL_SERVER_ERROR);

	}

	@ExceptionHandler(MyCustomException.class)
	public final ResponseEntity<String> handleUserNotFoundException(MyCustomException ex, WebRequest request) {

		return new ResponseEntity<>(ApplicationConstants.BAD_REQUEST, HttpStatus.NOT_FOUND);

	}
}