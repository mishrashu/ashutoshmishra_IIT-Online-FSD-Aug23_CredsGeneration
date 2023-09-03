package com.ashutosh.model;

public class Employee {
	private String firstName;
	private String lastName;

	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName.toLowerCase();
		this.lastName = lastName.toLowerCase();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
