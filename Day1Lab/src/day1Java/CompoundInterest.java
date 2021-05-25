package day1Java;

public class CompoundInterest {

	public static void main(String[] args) {

		int p = 20000;
		double r = 0.06;
		int t = 3;
		Double interest;

		double amount = p * (Math.pow(1 + (r / t), t));
		interest = amount - p;

		System.out.println("Amount after 3 years is " + amount);
		System.out.println("Interest after 3 years is " + interest);

	}

}
