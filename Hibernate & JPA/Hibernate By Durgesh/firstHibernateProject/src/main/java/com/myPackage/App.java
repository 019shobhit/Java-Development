package com.myPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

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
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Processing ..." );
        
        Student st = new Student();
        st.setCity("Baghpat");
        st.setId(2);
        st.setName("Shobhit");
        System.out.println(st);
        
        Address ad = new Address();
        ad.setGaon("Barka");
        ad.setJilla("Baghpat");
        ad.setOpen(true);
        ad.setDate(new Date());
        ad.setX(12.34);
        FileInputStream in = new FileInputStream("src/main/java/abc.jpg");
        byte[] arr = new byte[in.available()];
        in.read(arr);
        ad.setImg(arr);
        
        
        
        Configuration cfg = new Configuration();
        cfg.configure("com/config/hibernate.cfg.xml");
        
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(st);
        session.save(ad);
        transaction.commit();
        
        session.close();
        System.out.println("Done...");
        
        
        
//        SessionFactory sessionFactory= cfg.buildSessionFactory();
//        Session session= sessionFactory.openSession();
//        Transaction transection= session.beginTransaction();
//        
//        try {
//        session.save(st);
//        transection.commit();
//        }
//        catch (Exception e) {
//			// TODO: handle exception
//        	transection.rollback();
//        	e.printStackTrace();
//        }
		 
    }
}
