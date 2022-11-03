package com.fdmgroup.bankDesignProject;

import java.util.ArrayList;
import java.util.List;

public class AccountController {

	private List<Customer> customers = new ArrayList<Customer>();
	private List<Account> accounts = new ArrayList<Account>();

	// accountcontroller class methods..
	// CreateCustomer method.
	public Customer createCustomer(String name, String address, String type) {
		// check if the customer is a company or a person.
		if (type.equals("person")) {
			Person person = new Person(name, address);
			customers.add(person);
			return person;
		}
		if (type.equals("company")) {
			Company company = new Company(name, address);
			customers.add(company);
			return company;
		}
		return null;
	}

	// createAccount of the customer.
	public Account createAccount(Customer customer, String type) {
		if (type.equals("checking")) {
			CheckingAccount checkingAccount = new CheckingAccount();
			accounts.add(checkingAccount);
			customer.addAccount(checkingAccount);
			return checkingAccount;
		}
		if (type.equals("savings")) {
			SavingsAccount savingsAccount = new SavingsAccount();
			accounts.add(savingsAccount);
			customer.addAccount(savingsAccount);
			return savingsAccount;
		}
		return null;
	}

	// method to delete the customer and the accounts associated with it.
	public void removeCustomer(Customer customer) {
		customers.remove(customer);
		accounts.removeAll(customer.getAccounts());
	}

	// method to delete an account belonging to a particular customer.
	public void removeAccount(Account account) {
		accounts.remove(account);
		for (Customer customer : getCustomers()) {
			if (customer.getAccounts().contains(account)) {
				customer.removeAccount(account);
			}
		}
	}

	// method to get the list of all customers
	public List<Customer> getCustomers() {
		return customers;
	}

	// method to get the list of the accounts in the bank
	public List<Account> getAccounts() {
		return accounts;
	}

}
