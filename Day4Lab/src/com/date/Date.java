package com.date;

import java.util.Scanner;

public class Date {

	private int dd;
	private int mm;
	private int yy;

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date");
		dd = sc.nextInt();
		System.out.println("Enter month");
		mm = sc.nextInt();
		System.out.println("Enter year");
		yy = sc.nextInt();
		sc.close();
	}

	public void display() {
		int temp=yy;
		
		int count=0;
		
		while (yy != 0) {
			yy /= 10;
			count++;
		}
	
		
		if ((dd > 0 && dd < 32) && (mm > 0 && mm < 13)&& (count<5 && count>1)) {

			System.out.println("Date is :" + dd + " / " + mm + " / " + temp);
		} else
			System.out.println("Please enter a valid date");
		
	}
}
