package com.sample;

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
    	
    	Department dept=new Department();
    	dept.setDepartment_name("Support");
    	
    	Department dept1=new Department();
    	dept.setDepartment_name("IT");
    	
    	Details det=new Details();
    	det.setName("ABC");
    	det.setManager(true);
    	det.setDepartments(dept);
    	
    	Details det1=new Details();
    	det.setName("DEF");
    	det.setManager(true);
    	det.setDepartments(dept1);
    	
    	kSession.insert(dept);
    	kSession.insert(dept1);
    	
    	kSession.insert(det1);
    	
    	kSession.insert(det);
    	
    	kSession.fireAllRules();
    	
    	
    	
		}
	catch (Throwable t) {
        t.printStackTrace();
    }
	}
}
