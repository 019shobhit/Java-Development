package com.myPackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


 
public class EmDamo {
	public static void main(String[] args) {
		
		Certificate crt1 = new Certificate();
		crt1.setCourse("MCA");
		crt1.setDurstion(2);
		
		Student st1 = new Student();
		st1.setId(44);
		st1.setName("shobhit");
		st1.setCerti(crt1);
		
		
		Certificate crt2 = new Certificate();
		crt2.setCourse("BCA");
		crt2.setDurstion(3);
		
		Student st2 = new Student();
		st2.setId(11);
		st2.setName("shobhit Chauhan");
		st2.setCerti(crt2);
		
		
		Configuration cfg = new Configuration();
		cfg.configure("com/config/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(st1);
		session.save(st2);
		transaction.commit();
		
		
		session.close();
		factory.close();
	}

}
