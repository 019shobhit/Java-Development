package com.myPackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("com/config/hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Student s = (Student) session.load(Student.class,1);
		Address adr = (Address) session.get(Address.class,1);
		
		System.out.println(adr);
		System.out.println(s);
		
		
		session.close();
		factory.close();
	}

}
