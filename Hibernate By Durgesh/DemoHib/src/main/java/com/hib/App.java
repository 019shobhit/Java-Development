package com.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.User;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	User user1 = new User();
//    	user1.setId(1);
    	user1.setName("Shobhit");
    	user1.setEmail("019shobhit@gamil.com");
    	user1.setPassword("shobhit2002");
    	user1.setGender("Male");
    	user1.setCity("Baghpat");
    	
        System.out.println( "Hello World!" );
        
        Configuration cfg = new Configuration();
        cfg.configure("com/config/hibernate.cfg.xml");
        
        SessionFactory sessionFactory= cfg.buildSessionFactory();
        Session session= sessionFactory.openSession();
        Transaction transection= session.beginTransaction();
        
        try {
        session.save(user1);
        transection.commit();
        }
        catch (Exception e) {
			// TODO: handle exception
        	transection.rollback();
        	e.printStackTrace();
		}
        
    }
}
