package day1Java;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {

		int num, org;
		int sum = 1;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		org = num;

		while (num > 0) {
			sum *= num;
			num--;
		}

		System.out.println("factorial of " + org + " is " + sum);
		sc.close();
	}

}
