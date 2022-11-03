package com.fdmgroup.bankDesignProject;

public abstract class Account {

	private final long ACCOUNT_ID;
	// initialize the nextAccountId to start at 1000
	private static long nextAccountId = 1000;
	protected double balance;
	// the class constructor
	// the next accountID shall be set to be +5 of the current accountID

	public Account() {
		super();
		ACCOUNT_ID = nextAccountId;
		Account.nextAccountId += 5;
	}

	// account class methods
	// withdraw subtracts amount from the current balance.
	public double withdraw(double amount) {
		balance -= amount;
		return amount;
	}

	// deposit adds current balance to the amount.
	public void deposit(double amount) {
		this.balance += amount;
	}

	public long getACCOUNT_ID() {
		return ACCOUNT_ID;
	}

	public double getBalance() {
		return balance;
	}

	public void correctBalance(double amount) {
		this.balance = amount;
	}

}
