package org.itstep;

import java.util.ArrayList;

public class ShowMustGoOn {

	public static void main(String[] args) {

		LogFileCreator logCreator = new LogFileCreator();

		ArrayList<LogForExample> logList = logCreator.getLogList(20);
		logCreator.createFile(logList, "D:\\test\\logSession.txt");

	}

}
