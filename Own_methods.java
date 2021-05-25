package com.sample;

import java.util.Scanner;

public class Own_methods {
	
	
	public static void add()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter value1 ");
		int a=scan.nextInt();
		
		System.out.println("enter value2 ");
		int b=scan.nextInt();
		
		System.out.println("The result is "+(a+b));
		
	}

	public static void main(String[] args) 
	
	{
		add();

	}

}
