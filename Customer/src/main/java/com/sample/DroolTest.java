package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class DroolTest {
	public static final void main(String[] args) {
		try {
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession("ksession-dtables");

			Customer customer1 = new Customer("Franklin",1);
			

			kSession.insert(customer1);
			
		   
			kSession.fireAllRules();

			System.out.println("The discount for the Customer " + customer1.getName() + " is " + customer1.getDiscount());
			//System.out.println("The discount for the Customer " + customer2.getName() + " is " + customer2.getDiscount());

		} catch (Throwable t) {
			t.printStackTrace();
		}
	}
}
