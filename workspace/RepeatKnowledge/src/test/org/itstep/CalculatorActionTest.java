package test.org.itstep;

import static org.junit.Assert.*;

import org.itstep.CalculatorAction;
import org.junit.Test;

public class CalculatorActionTest {

	CalculatorAction cAction = new CalculatorAction();

	@Test
	public void testGetResultMultyply() {
		CalculatorAction cAction = new CalculatorAction();
		int actual = (int) cAction.getResult(5, 2, "*");
		assertEquals(10, actual);
	}

	@Test
	public void testGetResultPlus() {
		CalculatorAction cAction = new CalculatorAction();
		int actual = (int) cAction.getResult(5, 2, "+");
		assertEquals(7, actual);
	}

	@Test
	public void testGetResultMinus() {
		CalculatorAction cAction = new CalculatorAction();
		int actual = (int) cAction.getResult(5, 2, "-");
		assertEquals(3, actual);
	}

	@Test
	public void testGetResultWrongAction() {
		CalculatorAction cAction = new CalculatorAction();
		int actual = (int) cAction.getResult(5, 2555, "2555");
		assertEquals(10, actual);
	}

	@Test
	public void testGetResultWhenDividerZero() {
		CalculatorAction cAction = new CalculatorAction();
		int actual = (int) cAction.getResult(5, 0, "/");
		assertEquals(0, actual);
	}

}
