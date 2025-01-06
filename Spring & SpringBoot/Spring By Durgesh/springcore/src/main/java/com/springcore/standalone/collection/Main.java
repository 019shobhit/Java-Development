package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/standalone/collection/aloneConfig.xml");
		
		Person p = con.getBean("p",Person.class);
		System.out.println(p);
	}

}
