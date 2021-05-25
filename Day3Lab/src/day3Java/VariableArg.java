package day3Java;

import java.util.Scanner;

public class VariableArg {

	public static void sum(int... a) {
		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		System.out.println("Sum is " + sum);

	}

	public static void main(String[] args) {

		int k;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you want to add: ");
		k = sc.nextInt();
		int[] arr = new int[k];
		System.out.println("Enter numbers");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		sum(arr);

		sc.close();
	}

}
