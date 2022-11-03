package com.fdmgroup.bankDesignProject;

import java.util.ArrayList;
import java.util.List;

// the customer class for the customer object details
public abstract class Customer {

	private final long CUSTOMER_ID;
	private static long nextCustomerId = 2000000;
	private String name;
	private String address;
	private List<Account> accounts = new ArrayList<Account>();

	// the customer class constructor
	public Customer(String name, String address) {
		super();
		CUSTOMER_ID = nextCustomerId;
		Customer.nextCustomerId += 7;
		this.name = name;
		this.address = address;
	}

	// adding an bank account to a customer
	public void addAccount(Account account) {
		accounts.add(account);
	}

	// removing an account from a customer
	public void removeAccount(Account account) {
		accounts.remove(account);
	}

	public abstract void chargeAllAccounts(double amount);

	public List<Account> getAccounts() {
		return accounts;
	}

	// getters and setters.
	public long getCUSTOMER_ID() {
		return CUSTOMER_ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
