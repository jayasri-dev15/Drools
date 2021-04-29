package com.sample;

public class Main 
{

	public static void main(String[] args) 
	
	{
		AccountDetails a=new AccountDetails("Jayasri",123456,5000,15000,1000,"Savings");
        a.display();
        System.out.println("The avilable cash is "+  a.availableCash(5000, 15000 , 1000));
        
	}

}

// Multiple Inheritance is not supported in JAVA