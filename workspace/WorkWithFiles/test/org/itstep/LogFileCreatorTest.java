package org.itstep;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.Test;

public class LogFileCreatorTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		File file = new File("D:\\test\\testFileLog.txt");
		file.delete();

	}

	@Test
	public void testGetLogListIfSizeOne() {
		LogFileCreator fileCreator = new LogFileCreator();
		ArrayList<LogForExample> logs = fileCreator.getLogList(1);
		assertEquals(1, logs.size());

	}

	@Test
	public void testGetLogListIfSizeNegative() {
		LogFileCreator fileCreator = new LogFileCreator();
		ArrayList<LogForExample> logs = fileCreator.getLogList(-1);
		assertTrue(logs.isEmpty());

	}

	@Test
	public void testGetLogListIfSizeZero() {
		LogFileCreator fileCreator = new LogFileCreator();
		ArrayList<LogForExample> logs = fileCreator.getLogList(0);
		assertTrue(logs.isEmpty());

	}

	@Test
	public void testGetLogListIfSizeMoreThanOne() {
		LogFileCreator fileCreator = new LogFileCreator();
		ArrayList<LogForExample> logs = fileCreator.getLogList(15);
		System.out.println(Integer.MAX_VALUE);
		assertEquals(15, logs.size());

	}

	@Test
	public void testCreateFile() {
		LogFileCreator fileCreator = new LogFileCreator();
		ArrayList<LogForExample> logs = fileCreator.getLogList(15);
		String filePath = "D:\\test\\testFileLog.txt";
		fileCreator.createFile(logs, filePath);
		boolean fileExist = false;
		try {
			FileReader reader = new FileReader(filePath);
			fileExist = true;
			reader.close();
		} catch (FileNotFoundException e) {
			fileExist = false;
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		assertTrue(fileExist);
	}

	@Test
	public void testGetRandomNumber() {
		LogFileCreator fileCreator = new LogFileCreator();
		long rndNumber = fileCreator.getRandomNumber(10, 20);
		assertTrue(rndNumber >= 10 && rndNumber <= 20);
	}

}
