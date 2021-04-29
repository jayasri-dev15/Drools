package com.sample;

public class Animal  // Super class
{
    void eat() // Here I mentioned the normal habit of animals is eating
{
	System.out.println("Eating is a common habit for all animals here");
}
}

class Cow extends Animal
{
     void eat() // I am using the same method from Animal here (i.e: OVERIDING) achieved at runtime polymorphism 
{
	System.out.println("Cow eats grass");
}
}
class Cat extends Animal
{
     void eat()
{
	System.out.println("Cat drinks milk, eats fish");
}
}

//---------------------- Here I am overriding the subclasses like cow, cat --------------------------

class Peacock extends Cat               //overriding the method of cat here not an animal let's see the difference at Main class
{
	void eat()
	{
		System.out.println("Peacock eats Vegetables");
	}
}
