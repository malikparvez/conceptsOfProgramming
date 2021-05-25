package pack1;

import java.util.Scanner;

public class Student {

	public  int rollNo;
	public String name; 
	private char grade;
	int totalMarks;
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		rollNo = sc.nextInt();
		System.out.println();
		name = sc.next();
		System.out.println();
		grade = sc.next().charAt(0);
		
		sc.close();	}
	
	public void display() {
		
	System.out.println(rollNo);
	System.out.println(name);
	System.out.println(grade);
	
	
	
	
	
	}
	
	
	
	
	
	
	
}
