package com.example.Assignments.ques8;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.Assignments.ques8.CustomerService;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext context = 
	            new ClassPathXmlApplicationContext(new String[] {"ques8.xml"});
	    
	    	CustomerService cust = (CustomerService)context.getBean("customerService");
	    	
	    	System.out.println(cust);
	    	
	    	context.close();

	}

}
