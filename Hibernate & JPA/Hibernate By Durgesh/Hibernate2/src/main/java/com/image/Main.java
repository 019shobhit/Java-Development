package com.image;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) throws IOException {
		Address ad = new Address();
		ad.setDist("Baghpat");
		ad.setCity("NCR");
		ad.setOpen(true);
		ad.setX(123.12);
		ad.setDate(new Date());
		
		FileInputStream file = new FileInputStream("src/main/java/com/image/abc.jpg");
		byte[] data = new byte[file.available()];
		file.read();
		ad.setImage(data); 
		
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure("com/image/hibernate.cfg.xml").buildSessionFactory();
		Session s = factory.openSession();
		s.save(ad);
		Transaction tx = s.beginTransaction();
		tx.commit();
		
		
	
		s.close();
		factory.close();
		System.out.println("DONE.....  ");
		
	}

}
