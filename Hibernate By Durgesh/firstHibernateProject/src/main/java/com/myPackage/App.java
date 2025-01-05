package com.myPackage;

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
        System.out.println( "Processing ..." );
        
        Student st = new Student();
        st.setCity("Baghpat");
        st.setId(1);
        st.setName("Shobhit");
        System.out.println(st);
        
        Configuration cfg = new Configuration();
        cfg.configure("com/config/hibernate.cfg.xml");
        
        
        SessionFactory sessionFactory= cfg.buildSessionFactory();
        Session session= sessionFactory.openSession();
        Transaction transection= session.beginTransaction();
        
        try {
        session.save(st);
        transection.commit();
        }
        catch (Exception e) {
			// TODO: handle exception
        	transection.rollback();
        	e.printStackTrace();
        }
		 
    }
}
