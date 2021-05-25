package day1Java;

import java.util.Scanner;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		int num, even = 0, odd = 0;
		System.out.println("Enter the last term of series");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0)
				even += i;
		}
		System.out.println("Sum of even numbers is " + even);

		for (int i = 1; i <= num; i++) {
			if (i % 2 != 0)
				odd += i;
		}
		System.out.println("Sum of odd numbers is " + odd);
		
		sc.close();
	}

}
