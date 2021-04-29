package com.sample;

public abstract class Vehicle    //abstract class
{
abstract int speed();           //abstract method doesn't contains body
abstract float price(); 
abstract void modelName();
void message()                  //non-abstract method contains body
{
	System.out.println("Vehicle is created");
}
}
class car extends Vehicle
{

	@Override
	int speed() {
		// TODO Auto-generated method stub
		return 120;
	}

	@Override
	float price() {
		// TODO Auto-generated method stub
		return 540900;
	}

	@Override
	void modelName() {
		// TODO Auto-generated method stub
		System.out.println("Ferrari");
	}
	
	void message()
	{
		System.out.println("Car details are given");
	}
	
}
class Twowheeler extends Vehicle
{

	@Override
	int speed() {
		// TODO Auto-generated method stub
		return 64;
	}

	@Override
	float price() {
		// TODO Auto-generated method stub
		return 45000;
	}

	@Override
	void modelName() {
		// TODO Auto-generated method stub
		System.out.println("Yamaha");
	}
	
	void message()
	{
		System.out.println("Two - wheeler details are given");
	}
	
}