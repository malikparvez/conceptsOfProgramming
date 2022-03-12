package day1Java;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		int num, r, res = 0, temp;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		temp = num;

		while (num > 0) {
			r = num % 10;
			res = (res * 10) + r;
			num /= 10;

		}
		
		if (res == temp)
			System.out.println("Number is a palindrome");
		else
			System.out.println("Number is not a palindrome");
		sc.close();
	}

}
