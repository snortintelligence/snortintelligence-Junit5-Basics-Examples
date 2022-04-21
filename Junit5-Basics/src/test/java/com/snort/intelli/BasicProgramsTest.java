package com.snort.intelli;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BasicProgramsTest {

	BasicPrograms basicPrograms = new BasicPrograms();

	@Test
	void testNumberIsPositive() {
		boolean actual = basicPrograms.isPositiveNumber(10);
		assertTrue(actual);
	}

	@Test
	void testNumberIsNegetive() {
		boolean actual = basicPrograms.isNegetiveNumber(-10);
		assertTrue(actual);
	}

	@Test
	void testNumberIsArmstrong() {
		// test driven development
		// number that is the sum of its own digits each raised to the power of the
		// number of digits.
		boolean expected =false;
		boolean actual = basicPrograms.isArmstrongNumber("153");
		assertEquals(expected, actual);
	}

}
