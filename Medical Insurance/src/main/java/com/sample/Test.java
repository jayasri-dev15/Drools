package com.sample;

import java.util.ArrayList;
import java.util.List;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class Test 

{

	public static void main(String[] args) 
	
	{
		try
		{
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		KieSession kSession = kContainer.newKieSession("ksession-rules");
		
		
		Patient_Report report=new Patient_Report();
		
		report.setPatient_Id("P001");  
		report.setPatient_name("Raj");
		//report.setPatient_Visiting_Type("Regular");
		report.setHaving_Insurance_Profile(true);
		
		Category category=new Category("General",200000, true, 10);  //disease_name,premium_paid_amount,already_a_consultant,patient_consulted_count
		
	
		
		kSession.insert(category);
		kSession.insert(report);
		
		kSession.fireAllRules();
		
		//System.out.println("The patient details are "+report.getPatient_Id()+" and the type "+report.getPatient_Visiting_Type());
		
	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}


//count,profile (rule 1) ,visiting type,discount (rule 2)




/*Please follow the steps to raise customer supplied software request:
1. Please click here to raise a Customer supplied software/hardware request.
2. Choose the project name and fill in the required details (Manufacture name, Product name, Version, License Key and Installation Type).
3. Select the required From and To date.
4. Click Add Products. 5. Attach the customer approval mail and enable the Customer approval attached checkbox.
6. Click Submit.
7. Click here to view the status of the request.
Post client approval, the SLA is updated within 24 business hours.
Note: For more details, kindly check the One Communicator emails.*/