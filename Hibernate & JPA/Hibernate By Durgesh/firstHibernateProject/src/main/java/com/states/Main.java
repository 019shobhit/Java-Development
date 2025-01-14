package com.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {
	public static void main(String[] args) {
		//
		//Transient
		//Persistent
		//Detached
		//Removed
		
		SessionFactory sf = new Configuration().configure("com/config/hibernate.cfg.xml").buildSessionFactory();
		Session s = sf.openSession();
		
		Student st = new Student();
		st.setId(1);
		st.setName("Shobhit");
		
		s.clear();
		sf.close();
	}

}
