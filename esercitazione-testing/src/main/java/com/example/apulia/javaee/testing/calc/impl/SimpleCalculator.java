package com.example.apulia.javaee.testing.calc.impl;

import java.util.Objects;

import org.springframework.stereotype.Component;

import com.example.apulia.javaee.testing.calc.BaseCalculator;
import com.example.apulia.javaee.testing.exeption.CalculatorInputNotValidException;

@Component
public class SimpleCalculator implements BaseCalculator {

	@Override
	public Integer sum(Integer n1, Integer n2) throws CalculatorInputNotValidException {

		checkForNullValues(n1, n2);

		return n1 + n2;
	}

	@Override
	public Integer subtraction(Integer n1, Integer n2) throws CalculatorInputNotValidException {
		
		checkForNullValues(n1, n2);
		
		return n1 - n2;
	}

	@Override
	public Integer multiplication(Integer n1, Integer n2) throws CalculatorInputNotValidException {
		checkForNullValues(n1, n2);
		return n1 * n2;
	}

	@Override
	public Double division(Integer n1, Integer n2) throws CalculatorInputNotValidException {
		checkForNullValues(n1, n2);
		return Double.valueOf(n1 / n2);
	}

	/**
	 * 
	 * If input object is null throws an {@link CalculatorInputNotValidException}
	 * 
	 * @param n1
	 * @param n2
	 * @throws CalculatorInputNotValidException
	 */
	private void checkForNullValues(Object n1, Object n2) throws CalculatorInputNotValidException {

		if (Objects.isNull(n1))
			throw new CalculatorInputNotValidException("First parameter cannot be null!");

		if (Objects.isNull(n2))
			throw new CalculatorInputNotValidException("Second parameter cannot be null!");
	}

}
