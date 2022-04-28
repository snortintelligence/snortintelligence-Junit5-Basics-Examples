package com.snort.intelli;

/**
 * @author Siddhartha Sharma
 * @email snortintelligence@gmail.com
 * @StringUtils is user defined class implements IStringUtils interface. It
 *              facilitates to perform string operations.
 */
public class StringUtils implements IStringUtils {

	/**
	 * @textLength
	 * @param String text
	 * @function It counts size of the given characters sequence of a string.
	 * @Returns: any positive integer number or 0 for empty string.
	 * 
	 */
	@Override
	public int textLength(String text) {
		return text.length();
	}

	/**
	 * @textToUpperCase
	 * @param String text
	 * @function It converts given string / all characters sequence into CAPITAL
	 *           LETTERS or UPPERCASE
	 * @Returns: the String, converted to UPPERCASE.
	 * 
	 */
	@Override
	public String textToUpperCase(String text) {
		return text.toUpperCase();
	}

	/**
	 * @textToLowerCase
	 * @param String text
	 * @function It converts given string / all characters sequence into small
	 *           letter or lowercase
	 * @Returns: the String, converted to lowercase.
	 * 
	 */
	@Override
	public String textToLowerCase(String text) {
		return text.toLowerCase();
	}

	/**
	 * @isTextEmpty
	 * @param String text
	 * @function if the given string / character sequence text.length == 0 then it
	 *           means string is empty otherwise string is not empty.
	 * 
	 */
	@Override
	public boolean isTextEmpty(String text) {
		return text.isEmpty();
	}

	/**
	 * @isEquals
	 * @param String firstText, String secondText
	 * @function String is characters sequence, so compares both given firstText &
	 *           secondText strings having the same characters sequence or not.
	 */
	@Override
	public boolean isEquals(String firstText, String secondText) {
		return firstText.equals(secondText);
	}

	/**
	 * @reverseString
	 * @param String text
	 * @function extracts only 0th index value of given characters sequence or text
	 *           line.
	 */
	@Override
	public String reverseString(String text) {
		return new StringBuffer(text).reverse().toString();
	}

	/**
	 * @getFirstChar
	 * @param String text
	 * @function extracts only 0th index value of given sequence of characters or
	 *           text line.
	 */
	@Override
	public char getFirstChar(String text) {
		return text.charAt(0);
	}

	/**
	 * @toArray
	 * @param String text
	 * @function extracts and store each letter of given text/string into a char
	 *           array. if you given text = "hello" then it creates an array equals
	 *           of text length , char arr[] = new char[text.length];
	 */
	@Override
	public char[] toArray(String text) {
		return text.toCharArray();
	}

	/**
	 * @textStartWith
	 * @param String text, String endsWith
	 * @function A given sequence of characters or text line starts with specified
	 *           prefix or not.
	 */
	@Override
	public boolean textStartWith(String text, String startsWith) {
		return text.startsWith(startsWith);
	}

	/**
	 * @textEndWith
	 * @param String text, String endsWith
	 * @function A given sequence of characters or text line ends with specified
	 *           suffix or not.
	 */
	@Override
	public boolean textEndWith(String text, String endsWith) {
		return text.endsWith(endsWith);
	}

	/**
	 * @palindromeText
	 * @param String text
	 * @function A palindrome is a word, number, phrase, or other sequence of
	 *           characters which reads the same backward as forward, such as madam
	 *           or racecar.
	 */
	@Override
	public String palindromeText(String text) {
		return reverseString(text);
	}

}
