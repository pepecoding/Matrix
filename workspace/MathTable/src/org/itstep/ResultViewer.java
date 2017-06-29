package org.itstep;

public class ResultViewer {

	public static String showTable(int number1, int number2, String action, String textResult) {
		String textTable = "";
		textTable += " " + String.valueOf(number1) + "\n";
		textTable += action + " " + String.valueOf(number2) + "\n";
		textTable += "";
		int maxLenght = 0;
		if (+String.valueOf(number1).length() > maxLenght) {
			maxLenght = String.valueOf(number1).length();

		}

		if (+String.valueOf(number2).length() > maxLenght) {
			maxLenght = String.valueOf(number2).length();

		}

		if (textResult.length() > maxLenght) {
			maxLenght = textResult.length();

		}
		for (int i = 0; i < maxLenght; i++) {
			textTable += "---" + "\n";
		}
		textTable += "\n";
		textTable += "" + textResult;
		return textTable;
	}
}
