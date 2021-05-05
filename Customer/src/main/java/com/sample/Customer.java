package com.sample;

public class Customer {
	private int age;
	private int discount;
	private String name;
	
	public Customer(String name,int age) {
		super();
		this.name = name;
		this.age=age;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	
	}


