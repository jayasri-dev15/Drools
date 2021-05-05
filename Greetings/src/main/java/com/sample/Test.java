package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class Test {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		try {
			// TODO Auto-generated method stub
			KieServices ks = KieServices.Factory.get();
		    KieContainer kContainer = ks.getKieClasspathContainer();
	    	KieSession kSession = kContainer.newKieSession("ksession-rules");
	    	
	    	Person persons=new Person();
	    	persons.setName("Jayasri");
	    	persons.setTime(9);
	    	
	    	kSession.insert(persons);
	    	kSession.fireAllRules();
	    	
	    	System.out.println(persons.getMessage());
	    	
		}
		catch (Throwable t) {
	        t.printStackTrace();
	    }
	}

}
