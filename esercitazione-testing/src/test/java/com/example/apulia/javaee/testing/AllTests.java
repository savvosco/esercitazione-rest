package com.example.apulia.javaee.testing;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({CalculatorMockitoTest.class, CalculatorTest.class})
public class AllTests {

}
