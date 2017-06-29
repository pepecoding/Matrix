package org.itstep;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathActionExecutorTest {

	@Test
	public void testGetSum() {
		int result = MathActionExecutor.getSum(25, 26);
		assertEquals(51, result);
	}

	@Test
	public void testGetMultiply() {

	}

	@Test
	public void testGetDivision() {
		double result = MathActionExecutor.getDivision(9, 4);
		String resultAsText = String.valueOf(result);
		String expectedText = resultAsText.substring(0, 4);
		assertEquals("2.25", expectedText);

	}

	@Test
	public void testGetDivisionForZero() {

	}

	public void testGetDivisionForOne() {

	}

}