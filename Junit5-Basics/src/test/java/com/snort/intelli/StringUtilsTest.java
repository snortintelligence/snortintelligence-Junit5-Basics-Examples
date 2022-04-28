package com.snort.intelli;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringUtilsTest {

	@Test
	void testWhenTextIsPalindrome() {
		StringUtils stringUtils = new StringUtils();
		String actual = "madam";
		String expected = stringUtils.palindromeText(actual);
		assertEquals(expected, actual);

		actual = "mom";
		expected = stringUtils.palindromeText(actual);
		assertEquals(expected, actual);

	}

	@Test
	void testWhenTextIsNotPalindrome() {
		StringUtils stringUtils = new StringUtils();
		String actual = "aman";
		String expected = stringUtils.palindromeText(actual);
		assertNotEquals(expected, actual);
	}

}
