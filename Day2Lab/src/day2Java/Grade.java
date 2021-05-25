package day2Java;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		int rollno, sum = 0, perc;
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		name = sc.next();
		System.out.println("Enter roll no");
		rollno = sc.nextInt();

		int[] marks = new int[5];
		System.out.println("Enter marks of 5 subjects");

		for (int i = 0; i < marks.length; i++) {
			marks[i] = sc.nextInt();

		}
		System.out.println("Entered marks are");
		for (int j : marks) {
			System.out.println("" + j);
			sum = sum + j;

		}
		perc = (sum * 100) / 500;

		System.out.println("Name: " + name);
		System.out.println("Rollno: " + rollno);
		System.out.println("percentage is " + perc);

		if (perc > 75) {

			System.out.println("Grade:A");
		}

		else if (perc > 60 && perc < 74) {
			System.out.println("Grade:B");

		}

		else if (perc < 59) {
			System.out.println("Grade:C");

		}

		sc.close();
	}

}
