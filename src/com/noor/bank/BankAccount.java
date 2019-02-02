package com.noor.bank;

public class BankAccount {


	private int acc_no;
	private String name;
	private double amount;
	private static int noOfAccounts = 0;

	public String getAccountInfo() {
		return "Account number: " + acc_no + "\nCustomer Name: " + name + "\nBalance:" + amount + "\n";
	}

	public BankAccount(String n, double amt) {
		name = n;
		amount = amt;
		noOfAccounts++;
		acc_no = noOfAccounts;
	}

	public int getAccountNum() {
		return acc_no;
	}

	public void deposit(double amt) {

		if (amt <= 0) {
			System.out.println("Amount to be deposited should be positive");
		} else {
			amount = amount + amt;
			System.out.println("Amount deposited successfully");
		}
	}

	public void withdraw(double amt) {
		if (amt <= 0) {
			System.out.println("Amount to be withdrawn should be positive");
		} else {
			if (amount < amt) {
				System.out.println("Insufficient balance");
			} else {
				amount = amount - amt;
				System.out.println("Amount withdrawn successfully");

			}
		}
	}


}
