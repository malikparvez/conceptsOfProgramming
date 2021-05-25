package day1Java;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {

		int num, n;
		Double res;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		num = sc.nextInt();
		System.out.println("Enter the power of number");
		n = sc.nextInt();
		res = (Math.pow(num, n));
		System.out.println(num + " to the power " + n + " is " + res);

		sc.close();
	}

}
