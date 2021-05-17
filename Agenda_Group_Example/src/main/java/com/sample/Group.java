package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class Group {

    public static void main(String args[]) throws Exception {

    	KieServices ks = KieServices.Factory.get();
	    KieContainer kContainer = ks.getKieClasspathContainer();
    	KieSession kSession = kContainer.newKieSession("ksession-rules");
        try {
            LoanAmount loanAmount = new LoanAmount();
            loanAmount.setBankBalance(50000);
            loanAmount.setMonthlyInstallment(20000);
            loanAmount.setAccountId("ACC013867");
            
            kSession.insert(loanAmount);
            
            kSession.fireAllRules();
        }catch (Throwable t) {
            t.printStackTrace();
        }
    }

}






































