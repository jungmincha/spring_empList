package edu.bit.ex.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CalculatorTest {
	
Calculator cal = new Calculator();
	
	@Test  //junit�� ������ �� �ִ� ���� ǥ��
	public void testCalculator() {

	assertNotNull(cal);

	}
	
	@Test
public void testsum() {
		
		Calculator cal = new Calculator();
	
			int result = cal.sum(10, 20);
	
			assertEquals(30, result);
		

	}

}
