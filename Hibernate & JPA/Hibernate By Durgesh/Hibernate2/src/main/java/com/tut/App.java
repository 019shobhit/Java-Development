package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Student s1 = new Student();
    	s1.setId(1);
    	s1.setName("Shobhit");
    	s1.setCity("Baghpat");
    	
    	Certificate c = new Certificate();
    	c.setCourseId(111);
    	c.setCourseName("Java Development");
    	s1.setCerti(c);
    	
    	
        SessionFactory factory = new Configuration().configure("com/tut/hibernate.cfg.xml").buildSessionFactory();
        Session s = factory.openSession();
        System.out.println(s1);
        s.save(s1);
        Transaction tx = s.beginTransaction();
        tx.commit();
        
        s.clear();
        factory.close();
    }
}
