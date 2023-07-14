package com.canddella.entity;

public class SavingsMaxAccount extends Product {
	
	private String accountNo;
	private String accountType;
	private double balance;
	
	public SavingsMaxAccount(String productCode, String productType, String accountNo, String accountType,
			double balance) {
		super(productCode, productType);
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.balance = balance;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	
	
	
	

}
