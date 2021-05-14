package com.sample;

public class Category 

{
	
	private String disease_name;
	private double premium_paid_amount;
	private boolean already_a_consultant;
	private int patient_consulted_count;
	private double discount;
	
	
	Category(String disease_name, double premium_paid_amount, boolean already_a_consultant,
			int patient_consulted_count)
	{
		super();
		this.disease_name = disease_name;
		this.premium_paid_amount = premium_paid_amount;
		this.already_a_consultant = already_a_consultant;
		this.patient_consulted_count = patient_consulted_count;
		
	}
	
	public String getDisease_name() {
		return disease_name;
	}
	public void setDisease_name(String disease_name) {
		this.disease_name = disease_name;
	}
	public double getPremium_paid_amount() {
		return premium_paid_amount;
	}
	public void setPremium_paid_amount(double premium_paid_amount) {
		this.premium_paid_amount = premium_paid_amount;
	}
	public boolean isAlready_a_consultant() {
		return already_a_consultant;
	}
	public void setAlready_a_consultant(boolean already_a_consultant) {
		this.already_a_consultant = already_a_consultant;
	}
	public int getPatient_consulted_count() {
		return patient_consulted_count;
	}
	public void setPatient_consulted_count(int patient_consulted_count) {
		this.patient_consulted_count = patient_consulted_count;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	

}
