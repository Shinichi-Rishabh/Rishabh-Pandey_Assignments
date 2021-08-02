package com.example.Assignments.ques9;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.Assignments.ques9.HelloWorld;
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 
		        // Loading the Spring XML configuration
		        // file into the spring container and
		        // it will create the instance of
		        // the bean as it loads into container
		 
		        ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("ques9.xml");
		 
		        // It will close the spring container
		        // and as a result invokes the
		        // destroy() method
		        cap.close();
		    
	}

}
