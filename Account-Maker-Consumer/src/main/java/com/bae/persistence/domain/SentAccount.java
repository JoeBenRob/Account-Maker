package com.bae.persistence.domain;

public class SentAccount {

	private Long accountId;
	private String firstName;
	private String lastName;
	private String accountNumber;
	private String prize;

	public SentAccount() {
	}

	public SentAccount(Long accountId, String firstName, String lastName, String accountNumber, String prize) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
		this.accountId = accountId;
		this.prize = prize;
	}
	
	public String getPrize() {
		return prize;
	}

	public void setPrize(String prize) {
		this.prize = prize;
	}


	public Long getId() {
		return accountId;
	}

	public void setId(Long id) {
		this.accountId = id;
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

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}



}
