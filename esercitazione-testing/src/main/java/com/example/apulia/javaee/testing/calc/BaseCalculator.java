package com.example.apulia.javaee.testing.calc;

import com.example.apulia.javaee.testing.exeption.CalculatorInputNotValidException;

/**
 * 
 * Interface for Basic Calculator
 * 
 * @author Sandbox
 *
 */
public interface BaseCalculator {

	/**
	 * 
	 * Executes sum for passed numbers, throws
	 * {@link CalculatorInputNotValidException} if input is null
	 * 
	 * @param n1 sum first member
	 * @param n2 sum second member
	 * @return sum of input numbers
	 * @throws CalculatorInputNotValidException
	 */
	Integer sum(Integer n1, Integer n2) throws CalculatorInputNotValidException;

	Integer subtraction(Integer n1, Integer n2) throws CalculatorInputNotValidException;

	Integer multiplication(Integer n1, Integer n2) throws CalculatorInputNotValidException;

	Double division(Integer n1, Integer n2) throws CalculatorInputNotValidException;

}
