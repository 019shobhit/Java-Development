package com.mapping1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1 = new Emp();
		e1.seteId(1);
		e1.seteName("shobhit");
		
		Emp e2 = new Emp();
		e2.seteId(2);
		e2.seteName("prafull");
		
		Emp e3 = new Emp();
		e3.seteId(3);
		e3.seteName("prince");
		
		Project p1 = new Project();
		p1.setpId(11);
		p1.setpName("SpringBoot");
		
		Project p2 = new Project();
		p2.setpId(12);
		p2.setpName("Hibernat");
		
		Project p3 = new Project();
		p3.setpId(13);
		p3.setpName("Servlet & Jsp");
		
		List<Emp> project1 = new ArrayList<>();
		project1.add(e1);
		project1.add(e2);
		
		List<Emp> project2 = new ArrayList<>();
		project2.add(e2);
		project2.add(e3);
		
		List<Project> emp1 = new ArrayList<>();
		emp1.add(p1);
		emp1.add(p2);
		
		List<Project> emp2 = new ArrayList<>();
		emp2.add(p2);
		emp2.add(p3);
		
		p1.setEmployes(project1);
		p2.setEmployes(project2);
		
		e1.setProjects(emp1);
		e2.setProjects(emp2);
		
		
		
		
		Configuration cfg = new Configuration();
		cfg.configure("com/config/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.save(e1);
		s.save(e2);
		s.save(e3);
		s.save(p1);
		s.save(p2);
		s.save(p3);
		
		tx.commit();
		s.close();
		sf.close();
		

	}

}
