package com.sample;

import java.util.HashMap;
import java.util.Map;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample file to launch a process.
 */
public class ProcessTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-process");

        	 Map<String, Object> params = new HashMap<String, Object>();  
             params.put("income", 2000);  
            // start a new process instance
            kSession.startProcess("com.sample.bpmn.vehicle",params);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
    
public class Passenger {  
    private String name;  
    private int income;  
    public String getname()  
    {                     
        return this.name;  
    }  
    public void setname(String value)  
    {                          
         this.name = value;  
    }  
    public int getincome()  
    {                          
        return this.income;  
    }  
    public void setincome(Integer value)  
    {                      
         this.income = value;  
    }  
}
}
