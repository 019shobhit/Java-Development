package com.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("com/config/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
//		Question q1 = new Question();
//		q1.setQuestion_id(1212);
//		q1.setQuestion("What is Java ?");
//		
//		Answer ans1 = new Answer();
//		ans1.setAnswerId(343);
//		ans1.setAnswer("Java is a programming language.");
//		ans1.setQuestion(q1);
//		
//		Answer ans2 = new Answer();
//		ans2.setAnswerId(344);
//		ans2.setAnswer("Java have OOPS concepts");
//		ans2.setQuestion(q1);
//		
//		Answer ans3 = new Answer();
//		ans3.setAnswerId(345);
//		ans3.setAnswer("Java have Spring and Springboot framework");
//		ans3.setQuestion(q1);
//		
//		List<Answer> list = new ArrayList<>();
//		list.add(ans1);
//		list.add(ans2);
//		list.add(ans3);
		
//		q1.setAnswers(list);
		
		
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		
		
//		s.save(q1);
//		s.save(ans1); 
//		s.save(ans2);
//		s.save(ans3);
		
		Question q = (Question) s.get(Question.class, 1212);
		System.out.println(q.getQuestion());
		for(Answer a : q.getAnswers()) {
			System.out.println(a.getAnswer());
		}
		
		
		tx.commit();
		s.close();
		factory.close();
		
		
		
	}

}
