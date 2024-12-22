package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/ci/ciConfig.xml");
//		Person p1 = (Person) con.getBean("person1");
//		System.out.println(p1);
		
		Addition add = (Addition) con.getBean("add");
		add.sum();
	}

}
