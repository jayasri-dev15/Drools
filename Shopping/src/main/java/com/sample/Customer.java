package com.sample;

public class Customer

{
private String name;
private String currency;

Customer(String name, String currency) 

{
	super();
	this.name = name;
	this.currency = currency;
}

public String getName() 
{
	return name;
}

public String getCurrency() 
{
	return currency;
}
public void setCurrency(String currency) 
{
	this.currency = currency;
}


}
