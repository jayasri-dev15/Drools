package com.sample;

public class Main {

	public static void main(String[] args) 
	{
	car c=new car();           //normal abject creation for cars
	c.message();
	c.modelName();
	System.out.println(+c.price());
	System.out.println("The speed of the car is "+c.speed()+" km/ph");
	System.out.println("===========================================");
	
	Vehicle v=new Twowheeler();      // Object creation using abstract class referring extended class
	v.message();
	v.modelName();
	System.out.println(+v.price());
	System.out.println("The speed of the two - wheeler is "+v.speed()+" km/ph");
	
	}

}
