package com.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.myPackage.Student;

public class HQLExample {
    public static void main(String[] args) {
        // Step 1: Configure and build the session factory
        SessionFactory factory = new Configuration()
                .configure("com/config/hibernate.cfg.xml")
                .addAnnotatedClass(Student.class) // Ensure Student entity is registered
                .buildSessionFactory();

        // Step 2: Open a session
        Session session = factory.openSession();

        try {
            // Step 3: Start transaction
            session.beginTransaction();

            // Step 4: Correct HQL query to fetch all Student entities
            String hql = "FROM Student"; // Fetch all rows from the Student entity

            // Step 5: Execute the query
            List<Student> students = session.createQuery(hql, Student.class).getResultList();

            // Step 6: Process the results
            for (Student student : students) {
                System.out.println(student.getName()); // Print the name of each student
            }

            // Step 7: Commit the transaction
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(); // Log exceptions
        } finally {
            // Step 8: Close session and factory
            session.close();
            factory.close();
        }
    }
}
