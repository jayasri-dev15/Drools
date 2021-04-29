package com.sample;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
    Account a=new Account("Jayasri",123445,5000,12000,1000,"Savings");
    System.out.println("The available balance is "+a.availableCash(5000,12000,1000));
	}

}
