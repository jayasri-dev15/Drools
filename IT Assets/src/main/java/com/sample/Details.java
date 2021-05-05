package com.sample;         // to deliver the assets only to a managers belongs to an IT department

public class Details 

{
private String name;
private boolean manager;
private Department departments;
private String message;

public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public boolean isManager() {
	return manager;
}
public void setManager(boolean manager) {
	this.manager = manager;
}
public Department getDepartments() {
	return departments;
}
public void setDepartments(Department departments) {
	this.departments = departments;
}



}
