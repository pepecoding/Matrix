package org.itstep;

public class AppRunner {

	public static void main(String[] args) {

		String filePath = "D://testFile.txt";
		String action = "*";
		double n1 = 25.58;
		double n2 = 10;

		CalculatorAction cAction = new CalculatorAction();

		FileReaderWriter frw = new FileReaderWriter();

		double result = cAction.getResult(n1, n2, action);
		frw.writeToFile(n1, n2, action, result, filePath);
		System.out.println(frw.readFromFile(filePath));

	}

}
