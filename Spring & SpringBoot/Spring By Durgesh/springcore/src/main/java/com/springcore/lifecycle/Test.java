package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
	
		AbstractApplicationContext con =new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");	
//		Samosa s = (Samosa) con.getBean("s1");
//		System.out.println(s);
		con.registerShutdownHook();
//		
//		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
//		Pepsi p = (Pepsi) con.getBean("p1");
//		System.out.println(p);
		Example ex = (Example) con.getBean("e1");
		System.out.println(ex);
		
	}
}
	