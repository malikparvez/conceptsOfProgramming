package day2Java;

import java.util.Scanner;

public class ShoppingList {

	public static void main(String[] args) {

		int total = 0, choice;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);

		while (flag != true) {

			System.out.println("Enter 1: Pen");
			System.out.println("Enter 2: Pencil");
			System.out.println("Enter 3: Notebook");
			System.out.println("Enter 4: Bottle");
			System.out.println("Enter 5: Colorbox");
			System.out.println("Enter 6: To find total");

			choice = sc.nextInt();

			switch (choice) {

			case 1: {
				System.out.println("Enter number of Pens");
				int n1, cost;
				n1 = sc.nextInt();
				cost = n1 * 10;
				total += cost;
				break;
			}

			case 2: {
				int n1, cost;
				n1 = sc.nextInt();
				cost = n1 * 5;
				total += cost;
				System.out.println("Enter number of Pencils");
				break;
			}

			case 3: {
				int n1, cost;
				n1 = sc.nextInt();
				cost = n1 * 20;
				total += cost;
				System.out.println("Enter number of Notebooks");
				break;
			}

			case 4: {
				int n1, cost;
				n1 = sc.nextInt();
				cost = n1 * 30;
				total += cost;
				System.out.println("Enter number of Bottles");
				break;
			}

			case 5: {
				int n1, cost;
				n1 = sc.nextInt();
				cost = n1 * 50;
				total += cost;
				System.out.println("Enter number of Colorboxes");
				break;
			}

			case 6:
				flag = true;
				break;

			default:
				System.out.println("Please enter a valid choice");

			}

		}
		System.out.println("Total amount is " + total);

		sc.close();

	}

}
