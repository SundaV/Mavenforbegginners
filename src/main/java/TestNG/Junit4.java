package TestNG;

import org.junit.Before;
import org.junit.Test;
import org.testng.reporters.XMLConstants;

public class Junit4 {

	private InterestCalculator interestCalculator;
	@Before
	public void init() {
	interestCalculator = new Simplecalculator();
	interestCalculator.setRate(0.05);
	}
	@Test
	public void calculate() {
	double interest = interestCalculator.calculate(10000, 2);
	//assertEquals(interest, 1000.0, 0);
	}
	

	
	@Test(expected = IllegalArgumentException.class)
	public void illegalCalculate() {
	interestCalculator.calculate(-10000, 2);
	}
}

