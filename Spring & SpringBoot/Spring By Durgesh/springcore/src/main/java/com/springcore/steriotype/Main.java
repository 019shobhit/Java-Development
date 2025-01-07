package com.springcore.steriotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/steriotype/sterioConfig.xml");
		
		Student s1 = con.getBean("stu",Student.class);
		Student s2 = con.getBean("stu",Student.class);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

	}

}
