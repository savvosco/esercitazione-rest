package com.example.apulia.javaee.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.example.apulia.javaee.testing.calc.impl.SimpleCalculator;
import com.example.apulia.javaee.testing.exeption.CalculatorInputNotValidException;


class CalculatorTest {

	private SimpleCalculator calc;
	private Integer n1;
	private Integer n2;
	private Integer nullNumber;

	@BeforeEach
	void initTest() {
		calc = new SimpleCalculator();
		n1 = 30;
		n2 = 20;
		nullNumber = null;
	}

	@Test
	void testSumOk() throws CalculatorInputNotValidException {

		Integer resultSum = calc.sum(n1, n2);

		assertNotNull(resultSum);
		assertEquals(Math.addExact(n1, n2), resultSum);

	}

	@Test
	void testSumFirstNull() throws CalculatorInputNotValidException {

		CalculatorInputNotValidException thrown = Assertions.assertThrows(CalculatorInputNotValidException.class,
				() -> {
					calc.sum(nullNumber, n2);
				}, "CalculatorInputNotValidException error was expected");

		Assertions.assertEquals("First parameter cannot be null!", thrown.getMessage());

	}

	@Test
	void testSumSecondNull() throws CalculatorInputNotValidException {

		CalculatorInputNotValidException thrown = Assertions.assertThrows(CalculatorInputNotValidException.class,
				() -> {
					calc.sum(n1, nullNumber);
				}, "CalculatorInputNotValidException error was expected");

		Assertions.assertEquals("Second parameter cannot be null!", thrown.getMessage());

	}
}
