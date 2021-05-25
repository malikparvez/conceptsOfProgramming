package day1Java;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num,r=0,res=0;
		System.out.println("Enter a number to check");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int temp=num;
		
		while(num>0)
			{
			r=num%10;
			res+=(r*r*r);
			num/=10;
			}
		if(res==temp)
		System.out.println("number is armstrong");
		else
			System.out.println("number is not an armstrong number");
		sc.close();
	}
	

}
