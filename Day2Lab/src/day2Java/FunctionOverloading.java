package day2Java;

public class FunctionOverloading {

	public static void add(int a, int b) {
		int sum = a + b;
		System.out.println("Sum is " + sum);
	}

	public static void add(double a, double b) {
		double sum = a + b;
		System.out.println("Sum is " + sum);
	}

	public static void add(int a, double b) {
		double sum = a + b;
		System.out.println("Sum is " + sum);
	}

	public static void add(double a, int b) {
		double sum = a + b;
		System.out.println("Sum is " + sum);
	}

	public static void main(String[] args) {

		int a;
		double b;
		a = 10;
		b = 56.6;

		add(a, b);

	}

}
