package TestNG;

import org.junit.Test;
import org.testng.annotations.BeforeMethod;

public class TestNG {

	private InterestCalculator interestCalculator;
	@BeforeMethod
	public void init() {
	interestCalculator = new Simplecalculator();
	interestCalculator.setRate(0.05);
	}
	@Test
	public void calculate() {
	double interest = interestCalculator.calculate(10000, 2);
	//assertEquals(interest, 1000.0);
	}
	//@Test(expectedExceptions = IllegalArgumentException.class)
	public void illegalCalculate() {
	interestCalculator.calculate(-10000, 2);
	}
	}
