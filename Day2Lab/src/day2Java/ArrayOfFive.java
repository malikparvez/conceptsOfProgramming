package day2Java;

import java.util.Scanner;

public class ArrayOfFive {

	public static void main(String[] args) {
		int [] arr=new int[5];
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter array elements");
		
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}

		for(int i:arr)
		{
			System.out.print(i);
		}

		sc.close();
		
	}

}
