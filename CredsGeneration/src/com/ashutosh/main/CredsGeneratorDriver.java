package com.ashutosh.main;

import java.util.Scanner;

import com.ashutosh.model.Employee;
import com.ashutosh.service.Credentials;

public class CredsGeneratorDriver {

	public static void main(String[] args) {

		String firstName, lastName;
		String department = null;
		String company = "abc";
		int option;
		boolean isValidOption = false;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter hire's first name");
		firstName = sc.next();

		System.out.println("Enter hire's last name");
		lastName = sc.next();

		Employee employee = new Employee(firstName, lastName);

		do {
			System.out.println("\nPlease enter the department from the following\n");
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal");

			/*
			 * Below will be used Technical - tech Admin - admin Human Resource -
			 * humanresource Legal - legal
			 */

			option = sc.nextInt();

			switch (option) {

			case 1:
				department = "tech";
				isValidOption = true;
				break;
			case 2:
				department = "admin";
				isValidOption = true;
				break;
			case 3:
				department = "humanresource";
				isValidOption = true;
				break;
			case 4:
				department = "legal";
				isValidOption = true;
				break;
			default:
				System.out.println("Invalid option - please enter ( 1 - 4 ) ");
				break;
			}
		} while (!isValidOption);

		Credentials creds = new Credentials(employee.getFirstName(), employee.getLastName(), department, company);

		creds.generatePassword();
		creds.generateEmailAddress();
		creds.showCredentials();
		sc.close();
	}
}
