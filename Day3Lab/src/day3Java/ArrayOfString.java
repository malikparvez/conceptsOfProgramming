package day3Java;

import java.util.Scanner;

public class ArrayOfString {

	public static void Accept(String[] ary) {

		for (String i : ary)
			System.out.println(i.toUpperCase());
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of string");
		int size = sc.nextInt();
		String[] arr = new String[size];
		System.out.println("Enter names");

		for (int i = 0; i < (arr.length); i++) {
			arr[i] = sc.nextLine();
		}

		Accept(arr);
		sc.close();
	}
}