package day1Java;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {

		int a;
		int b;
		int temp;

		System.out.println("Enter 2 numbers to swap");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();

		temp = a;
		a = b;
		b = temp;

		System.out.println("Swapped numbers are " + a + " " + b);
		sc.close();
	}

}
