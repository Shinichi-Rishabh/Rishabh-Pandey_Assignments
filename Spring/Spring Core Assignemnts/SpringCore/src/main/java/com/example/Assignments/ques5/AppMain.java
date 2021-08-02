package com.example.Assignments.ques5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.Assignments.ques5.Employee;

public class AppMain {
	
@SuppressWarnings("resource")	
public static void main(String[] args) {
	ApplicationContext ac = new ClassPathXmlApplicationContext("esource-annotation.xml");
	 
    Employee emp = ac.getBean("myemployee", Employee.class);
    System.out.println(emp.toString());
}
}
