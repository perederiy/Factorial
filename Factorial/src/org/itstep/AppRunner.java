package org.itstep;

public class AppRunner {

	public static void main(String[] args) {
		FactorialInit factorialInit = new FactorialInit();
		int factorial = factorialInit.getFactorial(7);
		System.out.println(factorial);

	}

}
