package com.fdmgroup.bankDesignProject;

public class SavingsAccount extends Account {

	private double interestRate;

	// methods
	public void addInterest() {
		double interestDue = (balance * interestRate) / 100;
		balance += interestDue;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double withdraw(double amount) {
		// override the withdraw method and implement if the balance in the bank is
		// greater than the amount withdrawn
		if (amount <= balance) {
			balance -= amount;
			return amount;
		}
		return 0;
	}

}
