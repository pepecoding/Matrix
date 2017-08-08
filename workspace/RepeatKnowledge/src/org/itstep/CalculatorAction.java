package org.itstep;

public class CalculatorAction {

	public double getResult(double num1, double num2, String action) {

		double result = 0;
		switch (action) {
		case "+":
			result = num1 + num2;

			break;
		case "-":
			result = num1 - num2;

			break;
		case "/":
			long n2AsLong = Math.round(num2);
			if (n2AsLong == 0) {
				result = 0;

			} else {
				result = num1 / num2;

			}
			// try {
			// result = num1 / num2;
			// } catch (ArithmeticException e) {
			// result = 0;
			// e.printStackTrace();
			// }

			break;
		case "*":
			result = num1 * num2;
			break;

		}

		return result;

	}

}
