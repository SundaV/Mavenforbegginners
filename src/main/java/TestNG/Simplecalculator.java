package TestNG;

public class Simplecalculator implements InterestCalculator{
	private double rate;
	public void setRate(double rate) {
		this.rate = rate;
		}
		public double calculate(double amount, double year) {
		if (amount < 0 || year < 0) {
		throw new IllegalArgumentException("Amount or year must be positive");
		}
		
		else if(amount < 0 && year < 0){
			
			throw  new ArithmeticException("div by 0");
			
		}
		return amount * year * rate;
		}

}
