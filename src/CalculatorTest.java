import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testSum() {
		Calculator calculator = new Calculator();
		assertEquals(8, calculator.sum(4, 4), 0.001);
	}
	
	@Test
	public void testSubstract() {
		Calculator calculator = new Calculator();
		assertEquals(0, calculator.substract(4, 4), 0.001);
	}

	@Test
	public void testMultiply() {
		Calculator calculator = new Calculator();
		assertEquals(16, calculator.multiply(4, 4), 0.001);
	}
	
	@Test
	public void testDivide() {
		Calculator calculator = new Calculator();
		assertEquals(1, calculator.divide(4, 4), 0.001);
	}
	
	@Test
	(expected=java.lang.ArithmeticException.class)
	public void testDivideByZero() {
		Calculator calculator = new Calculator();
		calculator.divide(4, 0);  
	}
	
	
}
