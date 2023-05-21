package com.example.apulia.javaee.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.apulia.javaee.testing.calc.impl.SimpleCalculator;
import com.example.apulia.javaee.testing.exeption.CalculatorInputNotValidException;

@ExtendWith(MockitoExtension.class)
class CalculatorMockitoTest {

	@Mock
	private SimpleCalculator calc;

	private Integer n1;
	private Integer n2;

	@BeforeEach
	void initTest() {
		n1 = 30;
		n2 = 20;
	}

	@Test
	void testSumOk() throws CalculatorInputNotValidException {
		
	    when(calc.sum(anyInt(),anyInt())).thenReturn(10);

		Integer resultSum = calc.sum(n1, n2);

		//JunitFramework ASSERT
		assertNotNull(resultSum);
		assertEquals(10, resultSum);
		
		//MOCKITO VERIFY
		verify(calc, times(1)).sum(anyInt(), anyInt());
	}

	@Test
	void testSumFirstNull() throws CalculatorInputNotValidException {

		when(calc.sum(anyInt(), anyInt())).thenThrow(CalculatorInputNotValidException.class);
	    
		assertThrows(CalculatorInputNotValidException.class, () -> calc.sum(1,2));
		
		verify(calc, times(1)).sum(anyInt(), anyInt());
	}

}
