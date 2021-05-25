package day1Java;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {

		int n, sum;
		System.out.println("Enter last number of series to obtain sum");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		sum = (1 + n) * n / 2;

		System.out.println("Sum is " + sum);
		sc.close();
	}

}
