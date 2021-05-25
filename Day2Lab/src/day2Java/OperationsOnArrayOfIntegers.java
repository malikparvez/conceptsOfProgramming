package day2Java;

import java.util.Scanner;

public class OperationsOnArrayOfIntegers {

		
		public static void main(String[] args) {

			int size;
			double avg;
			int max, min,sum=0;
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

			for (int i = 1; i < arr.length; i++)
			{
				if (arr[i] > max)
					max = arr[i];

				else if (arr[i] < min)
					min = arr[i];

			}
			
			for(int i=0;i<arr.length;i++)
				sum+=arr[i];
			
			avg=sum/size;

			System.out.println("Maximum value of array is " + max);
			System.out.println("Maximum value of array is " + min);
			System.out.println("Sum of array elements is " + sum);
			System.out.println("Average of array elements is " + avg);
			sc.close();
		}

	}

