package org.itstep;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class LogFileCreator {

	public ArrayList<LogForExample> getLogList(int size) {

		ArrayList<LogForExample> logList = new ArrayList<>();

		for (int i = 1; i <= size; i++) {
			long connectionId = getRandomNumber((long)(Integer.MAX_VALUE + 10000), (long) (Integer.MAX_VALUE + 19999));
			long connectionTime = System.currentTimeMillis() - ((1000 * 60 * 60) * i);
			String connectorIp = getRandomNumber(1, 255) + "." + getRandomNumber(1, 255) + "." + getRandomNumber(1, 255)
					+ "." + getRandomNumber(1, 255);
			int specId = (int) getRandomNumber(1000000, 1999999);
			LogForExample log = new LogForExample(connectionId, connectionTime, connectorIp, specId);
			logList.add(log);

		}
		return logList;
	}

	public void createFile(ArrayList<LogForExample> logList, String filePath) {
		File file = new File(filePath);
		try {
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			String stringToWrite = " ";
			for (LogForExample log : logList) {
				stringToWrite += log.getConnectionId() + " " + log.getConnectionTime() + " " + log.getConnectorIp()
						+ " " + log.getSpecId() + "\n";
			}
			bufferedWriter.write(stringToWrite);
			bufferedWriter.flush();
			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	return file;

	}

	public long getRandomNumber(long minNum, long maxNum) {
		return (long) (minNum + (Math.random() * (maxNum - minNum + 1)));

	}

}
