package day1Java;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {

		int no1;
		int no2;
		int result;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number 1");
		no1 = sc.nextInt();

		System.out.println("Enter number 2");
		no2 = sc.nextInt();

		result = no1 + no2;

		System.out.println("Addition is " + result);
		sc.close();
	}

}
