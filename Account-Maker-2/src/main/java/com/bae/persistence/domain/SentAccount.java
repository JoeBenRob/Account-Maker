package com.bae.persistence.domain;

public class SentAccount {
	
    private String firstName;
    private String lastName;
    private String accountNumber;
    private String prize;
    
	public SentAccount(Account account){
        this.prize = account.getPrize();
        this.firstName = account.getFirstName();
        this.lastName = account.getLastName();
        this.accountNumber = account.getAccountNumber();

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

	public String getPrize() {
		return prize;
	}

	public void setPrize(String prize) {
		this.prize = prize;
	}

}