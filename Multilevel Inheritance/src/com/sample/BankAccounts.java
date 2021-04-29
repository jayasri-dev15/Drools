package com.sample;

public class BankAccounts  // multilevel inheritance 

{
String CustomerName;
int accountNo;

BankAccounts(String customerName, int accountNo) 
{
	super();
	this.CustomerName = customerName;
	this.accountNo = accountNo;
}

void display()
{
	System.out.println("The customer name is "+CustomerName);
	System.out.println("The account number of the customer is "+accountNo);
}

}

//--------------- Extending the BankAccounts by adding balance details ----------------

class AccountTracking extends BankAccounts
{
	double withdrawalAmount;
	double remainingCash;

	AccountTracking(String customerName, int accountNo, double withdrawalAmount, double remainingCash) 
	{
		super(customerName, accountNo);
		this.withdrawalAmount = withdrawalAmount;
		this.remainingCash = remainingCash;
	}
	
	void display()
	{
		super.display();
		System.out.println("The amount withdrawed is "+withdrawalAmount);
		System.out.println("The remaining cash available is "+remainingCash);
		
	}
	
}

//-------------- Extending the AccountTracking by adding additional details -------------

class AccountDetails extends AccountTracking
{
	double minimumOpeningBalance;
	String accountType;
	
	AccountDetails(String customerName, int accountNo, double withdrawalAmount, double remainingCash,double minimumOpeningBalance, String accountType) 
	{
		super(customerName, accountNo, withdrawalAmount, remainingCash);
		this.minimumOpeningBalance = minimumOpeningBalance;
		this.accountType = accountType;
	}
	
	double availableCash( double withdrawalAmount, double remainingCash, double minimumOpeningBalance)
	{
		double total=remainingCash - withdrawalAmount - minimumOpeningBalance;
		return total;
		
	}
	
	void display()
	{
		super.display();
		System.out.println("The minimum opening balance for the account is "+minimumOpeningBalance);
		System.out.println("The account type is of "+accountType);
	}
}