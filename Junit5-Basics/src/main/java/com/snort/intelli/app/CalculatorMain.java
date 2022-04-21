package com.snort.intelli.app;

import com.snort.intelli.Calculator;

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int result = calculator.subtract(12, 3);
		System.out.println("subtract(12,3)  : "+result);
		
		System.out.println(Math.cbrt(5));
		
		System.out.println(Math.pow(1, 3));
		System.out.println(Math.pow(5, 3));
		System.out.println(Math.pow(3, 3));
	}
}
