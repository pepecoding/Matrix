package org.itstep;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {

	public void writeToFile(double n1, double n2, String action, double result, String filePath) {

		String fileText = readFromFile(filePath);
		fileText += n1 + " " + action + " " + n2 + " = " + result + "\n";
		FileWriter writer;
		try {
			writer = new FileWriter(filePath);
			writer.write(fileText);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public String readFromFile(String filePath) {
		String textFromFile = "";
		int oneByte = -1;
		FileReader reader;
		try {
			reader = new FileReader(filePath);
			while ((oneByte = reader.read()) != -1) {
				textFromFile += textFromFile + String.valueOf((char) oneByte);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return textFromFile;

	}

}
