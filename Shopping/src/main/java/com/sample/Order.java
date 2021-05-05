package com.sample;

public class Order 

{
	private String id;
	private String stock;
	private int amount;
	private String action;
	
	
    Order(String id, String stock, int amount, String action) 
    
    {
		super();
		this.id = id;
		this.stock = stock;
		this.amount = amount;
		this.action = action;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getStock() {
		return stock;
	}


	public void setStock(String stock) {
		this.stock = stock;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public String getAction() {
		return action;
	}


	public void setAction(String action) {
		this.action = action;
	}
    
    
	
	
}
