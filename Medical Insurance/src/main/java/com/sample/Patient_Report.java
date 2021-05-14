package com.sample;

import java.util.List;

public class Patient_Report 


{
	
	private String patient_Id;
	private String patient_name;
	private String patient_Visiting_Type;
	private boolean isHaving_Insurance_Profile;

	
	
	public Patient_Report(String patient_Id, String patient_name, String patient_Visiting_Type,boolean isHaving_Insurance_Profile) {
		super();
		this.patient_Id = patient_Id;
		this.patient_name = patient_name;
		this.patient_Visiting_Type = patient_Visiting_Type;
		this.isHaving_Insurance_Profile = isHaving_Insurance_Profile;
	}
	public Patient_Report() {
		// TODO Auto-generated constructor stub
	}
	public String getPatient_Id() {
		return patient_Id;
	}
	public void setPatient_Id(String patient_Id) {
		this.patient_Id = patient_Id;
	}
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public String getPatient_Visiting_Type() {
		return patient_Visiting_Type;
	}
	public void setPatient_Visiting_Type(String patient_Visiting_Type) {
		this.patient_Visiting_Type = patient_Visiting_Type;
	}
	public boolean isHaving_Insurance_Profile() {
		return isHaving_Insurance_Profile;
	}
	public void setHaving_Insurance_Profile(boolean isHaving_Insurance_Profile) {
		this.isHaving_Insurance_Profile = isHaving_Insurance_Profile;
	}
	
	
	
	

}
