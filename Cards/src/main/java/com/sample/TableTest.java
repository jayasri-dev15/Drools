package com.sample;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieRepository;
import org.kie.api.builder.ReleaseId;
import org.kie.api.io.Resource;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.internal.io.ResourceFactory;


public class TableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
			 KieServices kieServices = KieServices.Factory.get();
			 Resource dt = ResourceFactory.newClassPathResource( "com/sample/dtables/offers.xlsx");
			 KieFileSystem kieFileSystem = kieServices.newKieFileSystem().write(dt);
			 KieBuilder kieBuilder = kieServices.newKieBuilder(kieFileSystem);
			 kieBuilder.buildAll();
			 KieRepository kieRepository = kieServices.getRepository();
			 ReleaseId krDefaultReleaseId = kieRepository.getDefaultReleaseId();
			 KieContainer kieContainer  = kieServices.newKieContainer(krDefaultReleaseId);
			 KieSession kieSession = kieContainer.newKieSession();
			 Purchase customer = new Purchase();
			 customer.setAmount(5000);
			 customer.setCardType("ICICI");
			 kieSession.insert(customer);
			 kieSession.fireAllRules();
		 } // load up the knowledge base
	        /*KieServices ks = KieServices.Factory.get();
 	    KieContainer kContainer = ks.getKieClasspathContainer();
     	KieSession kSession = kContainer.newKieSession("ksession-dtables");

         // go !
         Purchase p=new Purchase();
         p.setAmount(2000);
         p.setCardType("SBI");
         kSession.insert(p);
        // kSession.startProcess("offers.xlsx");
         kSession.fireAllRules();
     }*/
			 catch (Throwable t) {
	            t.printStackTrace();
	        }
	}

}
	
