package day1Java;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		int num, rev = 0, r;
		System.out.println("Enter a number to find its reverse");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		while (num > 0) {
			r = num % 10;
			rev = (rev * 10) + r;
			num /= 10;

		}
		System.out.println("Reverse of number is " + rev);
		
		sc.close();
	}

}
