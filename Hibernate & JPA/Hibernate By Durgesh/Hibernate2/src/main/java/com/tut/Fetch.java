package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetch {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("com/tut/hibernate.cfg.xml").buildSessionFactory();
        Session s = factory.openSession();
        
        Student stu = (Student) s.get(Student.class,1);
        System.out.println(stu);
        
        s.close();
        factory.close();
	}

}
