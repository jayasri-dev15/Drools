package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

public class Test
{

	public static void main(String[] args) 
	{
		try {
		// TODO Auto-generated method stub
		KieServices ks = KieServices.Factory.get();
	    KieContainer kContainer = ks.getKieClasspathContainer();
    	KieSession kSession = kContainer.newKieSession("ksession-rules");
    	
    	Purchase p=new Purchase();
    	p.setCardType("SBI");
    	p.setAmount(9000);
    	
    	
    	FactHandle fact1;

		fact1 = kSession.insert(p);
		kSession.fireAllRules();

		System.out.println("The product is purchased with the card type of " +p.getCardType()+ " so the discount is " + p.getDiscount());
    }
	catch (Throwable t) {
        t.printStackTrace();
    }
}
}


