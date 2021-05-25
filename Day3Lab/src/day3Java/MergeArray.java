package day3Java;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {

		int size;
		int pos = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter size of array: ");
		size = sc.nextInt();

		int[] arr1 = new int[size];
		int[] arr2 = new int[size];

		System.out.println("Please enter elements of array1: ");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}

		System.out.println("Please enter elements of array2: ");

		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();

		}

		int len = (arr1.length + arr2.length);
		int[] arr3 = new int[len];

		System.out.println("elements of array3: ");

		for (int i = 0; i < arr1.length; i++) {

			arr3[pos] = arr1[i];

			pos++;

		}

		for (int i = 0; i < arr2.length; i++) {

			arr3[pos] = arr2[i];

			pos++;

		}

		System.out.println(Arrays.toString(arr3));

		sc.close();

	}

}
