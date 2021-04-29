package com.sample;

public class Main {

	public static void main(String[] args) 
	
	{
		Employee e=new Employee();
		e.setEmployeeId(12345);
		e.setEmployeeName("Jayasri");
		e.setEmployeeRole("Designer");
		e.setSalary(45000);
		
		System.out.println("The employee id of "+e.getEmployeeId()+" whose name is "+e.getEmployeeName()+" with a designation of "+e.getEmployeeRole()+" is getting a salary of "+e.getSalary());

	}

}
