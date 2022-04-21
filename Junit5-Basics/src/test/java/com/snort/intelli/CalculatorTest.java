package com.snort.intelli;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator calculator = new Calculator();

	@Test
	void testSubtract() {
		int actual = calculator.subtract(12, 3);
		int expected = 9;
		assertEquals(expected, actual);// verify the result what you expect
	}

	@Test
	void testSum() {
		int actual = calculator.sum(12, 3);
		int expected = 15;
		assertEquals(expected, actual);
	}

	@Test
	void testMultiply() {
		int actual = calculator.multiply(12, 3);
		int expected = 36;
		assertEquals(expected, actual);
	}

	@Test
	void testDivide() {
		int actual = calculator.divide(12, 3);
		int expected = 4;
		assertEquals(expected, actual);
	}

	@Test
	void testReminder() {
		int actual = calculator.reminder(14, 3);
		int expected = 2;
		assertEquals(expected, actual);
	}
	
	@Test
	void testSubtractWhenGivenNumbersNegetive() {
		int actual = calculator.subtract(-12, -3);
		int expected = 9;
		assertEquals(expected, actual , "The both numbers should be valid!");// verify the result what you expect
	}
}
