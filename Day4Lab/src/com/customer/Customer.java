package com.customer;

import java.util.Scanner;

public class Customer {

	Scanner sc = new Scanner(System.in);

	private String name;
	private String email;
	private int age;
	private double creditLimit;

	void acceptDetails() {
		System.out.println("Enter name");
		name = sc.nextLine();
		System.out.println("Enter email");
		email = sc.nextLine();
		System.out.println("Enter age");
		age = sc.nextInt();
		System.out.println("Enter credit limit");
		creditLimit = sc.nextDouble();

	}

	void showDetails() {

		System.out.println("name: " + name);
		System.out.println("email: " + email);
		System.out.println("age: " + age);
		System.out.println("creditLimit: " + creditLimit);

	}

}
