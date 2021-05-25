package day3Java;

import java.util.Scanner;

public class AdditionOf2DimArray {

	public static void main(String[] args) {

		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of matrix");
		size = sc.nextInt();

		int[][] arr1 = new int[size][size];
		int[][] arr2 = new int[size][size];
		int[][] arr3 = new int[size][size];
		
		System.out.println("Enter elements of first matrix");
		
		for (int i = 0; i < arr1.length; i++)
		{
			for (int j = 0; j < arr1.length; j++)
				arr1[i][j] = sc.nextInt();
		}


		System.out.println("Enter elements of second matrix");
		
		for (int i = 0; i < arr2.length; i++)
		{
			for (int j = 0; j < arr2.length; j++)
				arr2[i][j] = sc.nextInt();
		}

		for (int i = 0; i < arr3.length; i++)
		{
			for (int j = 0; j < arr3.length; j++)
				arr3[i][j] = (arr1[i][j]+arr2[i][j]);
		}
		
		
		
		
		System.out.println("Sum of two matrix is ");
		
		
		for (int j = 0; j < arr3.length; j++) 
		{
			for (int k = 0; k < arr3.length; k++)
			{
				System.out.print(" " + arr3[j][k]);
			}
			System.out.print("\n");
		}

		sc.close();

	}
}