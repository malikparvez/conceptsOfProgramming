package day1Java;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		int num;
		boolean flag = false;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.println("Number is a prime number");
		else
			System.out.println("Number is not prime");

		sc.close();
	}

}
