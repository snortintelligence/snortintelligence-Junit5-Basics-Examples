package com.snort.intelli;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	

	@Test
	void testSubtract() {
		Calculator calculator = new Calculator();
		int actual = calculator.subtract(12, 3);
		int expected = 9;
		assertEquals(expected, actual);// verify the result what you expect
	}

	@Test
	void testSum() {
		Calculator calculator = new Calculator();
		int actual = calculator.sum(12, 3);
		int expected = 15;
		assertEquals(expected, actual);
	}

	@Test
	void testMultiply() {
		Calculator calculator = new Calculator();
		int actual = calculator.multiply(12, 3);
		int expected = 36;
		assertEquals(expected, actual);
	}

	@Test
	void testDivide() {
		Calculator calculator = new Calculator();
		int actual = calculator.divide(12, 3);
		int expected = 4;
		assertEquals(expected, actual);
	}

	@Test
	void testReminder() {
		Calculator calculator = new Calculator();
		int actual = calculator.reminder(14, 3);
		int expected = 2;
		assertEquals(expected, actual);
	}
	
	@Test
	void testSubtractWhenGivenNumbersNegetive() {
		Calculator calculator = new Calculator();
		int actual = calculator.subtract(-12, -3);
		int expected = 9;
		assertEquals(expected, actual , "The both numbers should be valid!");// verify the result what you expect
	}
}
