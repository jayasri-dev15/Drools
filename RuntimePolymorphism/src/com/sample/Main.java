package com.sample;

public class Main {

	public static void main(String[] args) 
	{
		Animal a=new Animal();  // creating object for Animal class alone (i.e : SUPER CLASS)
		a.eat();
		
		Animal a1=new Cow();   // we are referring parent class (super class) to sub class (reference variable of parent class is referring to child class) so at run time sub class is invoked
		a1.eat();
		
		Animal a2=new Cat();
		a2.eat();
		
		Animal a3=new Peacock();
		a3.eat();
		
	}

}
