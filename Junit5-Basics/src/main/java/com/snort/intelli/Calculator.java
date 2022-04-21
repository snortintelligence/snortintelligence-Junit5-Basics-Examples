package com.snort.intelli;

public class Calculator implements ICalculatorUtils {

	private int result;

	@Override
	public int sum(int a, int b) {
		result = a + b;
		return result;
	}

	@Override
	public int subtract(int a, int b) {
		result = a - b;
		return result;
	}

	@Override
	public int multiply(int a, int b) {
		result = a * b;
		return result;
	}

	@Override
	public int divide(int a, int b) {
		result = a / b;
		return result;
	}

	@Override
	public int reminder(int a, int b) {
		result = a % b;
		return result;
	}

}// end of Calculator class
