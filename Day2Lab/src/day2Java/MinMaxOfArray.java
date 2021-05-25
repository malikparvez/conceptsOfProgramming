package day2Java;

import java.util.Scanner;

public class MinMaxOfArray {

	public static void main(String[] args) {

		int size;
		int max, min;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");

		size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter elements of array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		max = arr[0];
		min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];

			else if (arr[i] < min)
				min = arr[i];

		}

		System.out.println("Maximum value of array is " + max);
		System.out.println("Maximum value of array is " + min);

		sc.close();
	}

}
