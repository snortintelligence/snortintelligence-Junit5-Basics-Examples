package com.snort.intelli;

public class BasicPrograms implements IBasicPrograms {

	@Override
	public boolean isPositiveNumber(int n) {
		return n > 0;
	}

	@Override
	public boolean isNegetiveNumber(int n) {
		return n < 0;
	}

	@Override
	public boolean isOddNumber(int n) {
		return n % 2 == 1;
	}

	@Override
	public boolean isEvenNumber(int n) {
		return n % 2 == 0;
	}

	@Override
	public boolean isArmstrongNumber(String num) {
		return false;
	}

}
