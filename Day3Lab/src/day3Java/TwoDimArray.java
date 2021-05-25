package day3Java;

import java.util.Scanner;

public class TwoDimArray {

	public static void main(String[] args) {

		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of matrix");
		size = sc.nextInt();

		int[][] arr = new int[size][size];
		
		System.out.println("Enter matrix elements");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++)
				arr[i][j] = sc.nextInt();
		}
		
		System.out.println("Matrix elements are");
		
		for (int j = 0; j < arr.length; j++) {
			for (int k = 0; k < arr.length; k++) {
				System.out.print(" " + arr[j][k]);
			}
			System.out.print("\n");
		}

		sc.close();

	}

}
