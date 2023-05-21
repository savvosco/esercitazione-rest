package com.example.apulia.javaee.testing.exeption;

public class CalculatorInputNotValidException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public CalculatorInputNotValidException(String message) {
		super(message);
	}
	
}
