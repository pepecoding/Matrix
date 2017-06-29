package org.itstep;

public class ShowMustGoOn {

	public static void main(String[] args) {
		int number1 = 123;
		int number2 = 15;

		String action = "+";

		int resultAsInt;
		double resultAsDouble;
		String textResult;
		String actionResult;

		switch (action) {
		case "+":
			resultAsInt = MathActionExecutor.getSum(number1, number2);
			textResult = ResultReader.getTextFromResult(resultAsInt);
			actionResult = ResultViewer.showTable(number1, number2, action, textResult);
			System.out.println(actionResult);
			break;

		case "-":
			resultAsInt = MathActionExecutor.getMinus(number1, number2);
			textResult = ResultReader.getTextFromResult(resultAsInt);
			actionResult = ResultViewer.showTable(number1, number2, action, textResult);
			System.out.println(actionResult);
			break;

		case "/":
			resultAsDouble = MathActionExecutor.getDivision(number1, number2);
			textResult = ResultReader.getTextFromResult(resultAsDouble);
			actionResult = ResultViewer.showTable(number1, number2, action, textResult);
			System.out.println(actionResult);
			break;

		case "*":
			resultAsInt = MathActionExecutor.getMultiply(number1, number2);
			textResult = ResultReader.getTextFromResult(resultAsInt);
			actionResult = ResultViewer.showTable(number1, number2, action, textResult);
			System.out.println(actionResult);
			break;

		default:
			System.out.println("Action isn't correct!");
			break;
		}

	}

}
