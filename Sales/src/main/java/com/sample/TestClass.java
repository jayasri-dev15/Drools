package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

public class TestClass 

{

	public static void main(String[] args) 
	
	{
		try {
			// TODO Auto-generated method stub
			KieServices ks = KieServices.Factory.get();
		    KieContainer kContainer = ks.getKieClasspathContainer();
	    	KieSession kSession = kContainer.newKieSession("ksession-rules");
	    	
	    	Sale s=new Sale();
	    	s.setQuantity(5);
	    	s.setItem("Bike");
	    	
	    	FactHandle fact1;

			fact1 = kSession.insert(s);
			kSession.fireAllRules();

			System.out.println("The discount for your purchase is "+s.getDiscount());
	    }
		catch (Throwable t) {
	        t.printStackTrace();
	    }

	}

}
