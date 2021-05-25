package day2Java;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		int salary;
		Double gross;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter basic salary");
		salary = sc.nextInt();

		if (salary <= 10000) {
			gross = salary + (0.2 * salary + 0.8 * salary);
			System.out.println("Gross salary is " + gross);
		}

		if (salary > 10000 && salary <= 20000) {
			gross = salary + (0.25 * salary + 0.9 * salary);
			System.out.println("Gross salary is " + gross);
		}

		if (salary > 20000) {
			gross = salary + (0.3 * salary + 0.95 * salary);
			System.out.println("Gross salary is " + gross);
		}
		sc.close();
	}

}
