package com.ashutosh.service;

import java.util.Random;

import com.ashutosh.interfaces.CredentialService;

public class Credentials implements CredentialService {

	private String department;
	private String password = "";
	private String firstName;
	private String lastName;
	private String company;
	private String email;
	private final String passwordCharacterSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()";
	private int lenghOfPassword = 8;

	public Credentials(String firstName, String lastName, String department, String company) {
		super();
		this.department = department;
		this.firstName = firstName;
		this.lastName = lastName;
		this.company = company;
	}

	@Override
	public void generatePassword() {

		Random rand = new Random();

		for (int i = 0; i < lenghOfPassword; i++) {
			int position = rand.nextInt(passwordCharacterSet.length());
			password = password + passwordCharacterSet.charAt(position);
		}
	}

	@Override
	public void generateEmailAddress() {
		email = firstName + lastName + "@" + department + "." + company + ".com";
	}

	@Override
	public void showCredentials() {
		System.out.println("Dear " + firstName + " your generated credentials are as follows");
		System.out.println("Email    ---> " + email);
		System.out.println("Password ---> " + password);

	}
}
