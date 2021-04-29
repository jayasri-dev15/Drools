package com.sample;      // method overloading

public class Sum
{
void add(int a,int b)
{
	System.out.println("The sum is "+(a+b));
}
void add(int a,float b,int c)
{
	System.out.println("The sum is "+(a+b+c));
}
void add(double a,float b)
{
	System.out.println("The sum is "+(a+b));
}
}
