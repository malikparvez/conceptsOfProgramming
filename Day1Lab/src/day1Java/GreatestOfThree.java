package day1Java;

import java.util.Scanner;

public class GreatestOfThree {

	public static void main(String[] args) {
	int a,b,c;
	System.out.println("Enter three numbers");
	Scanner sc = new Scanner(System.in);
	
	a = sc.nextInt();
	b = sc.nextInt();
	c = sc.nextInt();
	
	if(a>b)
	{
		if(a>c)
		
			System.out.println(a +" is largest of all");
			
	}
	
	else if(b>a)
	{
		if(b>c)
		
			System.out.println(b +" is largest of all");
			
	
	
	else 
			System.out.println(c +" is largest of all");
	
	}
	sc.close();
	}

}
