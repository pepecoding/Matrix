package org.itstep;

import static org.junit.Assert.*;

import java.io.File;
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
		
		
	}
		@Test
	public void testGetRandomNumber(){
		
	}
		
		
	}
	
	
