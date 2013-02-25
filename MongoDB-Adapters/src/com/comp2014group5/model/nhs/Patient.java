package com.comp2014group5.model.nhs;

public class Patient {

	private long nhsNumber;
	private String firstName;
	private String lastName;

	public long getNhsNumber() {
		return nhsNumber;
	}

	public void setNhsNumber(long nhsNumber) {
		this.nhsNumber = nhsNumber;
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
