package org.itstep;

import java.util.concurrent.TimeUnit;



public class Timer {
	
	public static void waitSomeSec(int sec) {
		Thread thread = new Thread();
		try {
			Thread.sleep(sec * 1000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}