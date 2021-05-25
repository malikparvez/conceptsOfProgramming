package day2Java;

import java.util.Scanner;

public class FindIndex {

	public static void main(String[] args) {
		int [] arr=new int[5];
		boolean flag=true;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter array elements");
		
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{   flag=true;
			if(num==arr[i]) {
			System.out.print(arr[i] +" number is present in array at index " +i);
			break;
			}
			else
			flag=false;
		
		}
		if(flag==false)
			System.out.println("does not exist");

		sc.close();
		
	}

}