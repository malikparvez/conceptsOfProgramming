package day2Java;

import java.util.Scanner;

public class FunctionToSwap {

	public static void swap(int a, int b) {
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("Swapped numbers are " + a + " " + b);

	}

	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		a = sc.nextInt();
		System.out.println("Enter second number");
		b = sc.nextInt();
		swap(a, b);

		sc.close();

	}

}
