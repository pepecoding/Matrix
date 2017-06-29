package org.itstep;

public class MathActionExecutor {

	public static int getSum(int number1, int number2) {
		int result = number1 + number2;
		return result;

	}

	public static int getMultiply(int number1, int number2) {
		int result = number1 * number2;
		return result;

	}

	public static double getDivision(int number1, int number2) {
		double result = (double) number1 / (double) number2;

		return result;

	}

	public static int getMinus(int number1, int number2) {
		int result = number1 - number2;
		return result;

	}
}
