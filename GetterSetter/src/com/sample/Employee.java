package com.sample;

public class Employee        // using getter and setter method; we can achieve encapsulation by keeping a data members alone as private so we can do read only/write only

{
private int employeeId;
private String employeeName;
private String employeeRole;
private int salary;


public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public String getEmployeeRole() {
	return employeeRole;
}
public void setEmployeeRole(String employeeRole) {
	this.employeeRole = employeeRole;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}


}
