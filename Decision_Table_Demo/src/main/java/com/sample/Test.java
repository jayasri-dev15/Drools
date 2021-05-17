package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class Test {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		 try {
				
			 //load up the knowledge base
		    KieServices ks = KieServices.Factory.get();
	 	    KieContainer kContainer = ks.getKieClasspathContainer();
	     	KieSession kSession = kContainer.newKieSession("ksession-dtables");

	         // go !
	         Bank b=new Bank();
	         b.setBname("Axis");
	         kSession.insert(b);
	         kSession.fireAllRules();
	         
	         System.out.println("The discount is "+b.getDiscount());
	     }
				 catch (Throwable t) 
			 
			 {
		            t.printStackTrace();
		        }
	}

}
