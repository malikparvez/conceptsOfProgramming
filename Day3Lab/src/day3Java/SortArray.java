package day3Java;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {

		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array ");
		size = sc.nextInt();
		int[] arr = new int[size];

		System.out.println("Enter array elements");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				int temp = 0;
				if (arr[i] > arr[j]) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}
		System.out.println("Sorted array elements are ");

			System.out.print(Arrays.toString(arr));
			sc.close();
	}

}
