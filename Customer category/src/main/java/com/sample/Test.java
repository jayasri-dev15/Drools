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
		// TODO Auto-generated method stub
		try
		{
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession("ksession-rules");
			
			List<Stocks> stocks=new ArrayList<Stocks>();
			
			   stocks.add(new Stocks("Apple", 10, 100));
			   stocks.add(new Stocks("Google", 35, 28));
			   stocks.add(new Stocks("Larsen", 100, 780));
			   stocks.add(new Stocks("TCS", 180, 1100));
			   stocks.add(new Stocks("Maruti", 160, 200));
			   
			   Customer customer = new Customer();
			   customer.setStocks(stocks);
			   customer.setCustId("C1500564");
			   
			   
			   List<Stocks> stocks2 = new ArrayList<Stocks>();
			   stocks2.add(new Stocks("Apple", 10, 100));
			   stocks2.add(new Stocks("Google", 35, 28));
			   stocks2.add(new Stocks("Larsen", 100, 780));
			   stocks2.add(new Stocks("TCS", 180, 1100));
			   stocks2.add(new Stocks("Maruti", 160, 200));
			   stocks2.add(new Stocks("Bhel", 60, 80));
			   stocks2.add(new Stocks("NTPC", 160, 40));
			   
			   Customer customer2 = new Customer();
			   customer2.setStocks(stocks2);
			   customer2.setCustId("C1506585");
			   
			   kSession.insert(customer);
			   kSession.insert(customer2);
			   kSession.fireAllRules();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
