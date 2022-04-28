package com.snort.intelli;

public interface IStringUtils {
	public int textLength(String text);

	public String textToUpperCase(String text);

	public String textToLowerCase(String text);

	public boolean isTextEmpty(String text);

	public boolean isEquals(String firstText, String secondText);

	public String reverseString(String text);

	public char getFirstChar(String text);

	public char[] toArray(String text);

	public boolean textStartWith(String text, String startsWith);

	public boolean textEndWith(String text, String endsWith);

	public String palindromeText(String text);
}
