package com.employee;

import java.util.Scanner;

public class Employee {

	private int EmployeeId;
	private String EmployeeName;
	private double BasicSalary;
	private double Medical;
	private double HRA;
	private double PF;
	private double PT = 200;
	private double NetSalary;
	private double GrossSalary;

	public void AcceptDetails() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter employee ID");
		EmployeeId = sc.nextInt();
		System.out.println("Please enter employee name");
		EmployeeName = sc.next();
		System.out.println("Please enter basic salary");
		BasicSalary = sc.nextDouble();
		System.out.println("Please enter medical amount");
		Medical = sc.nextDouble();
		sc.close();
	}

	public void DisplayDetails() {
		HRA = 0.5 * BasicSalary;
		PF = (12 / 100) * (BasicSalary);
		GrossSalary = BasicSalary + HRA + Medical;
		NetSalary = GrossSalary - (PT + PF);

		System.out.println("Name: " + EmployeeName);
		System.out.println("ID: " + EmployeeId);
		System.out.println("BasicSalary: " + BasicSalary);
		System.out.println("NetSalary: " + NetSalary);
		System.out.println("GrossSalary: " + GrossSalary);

	}

}
