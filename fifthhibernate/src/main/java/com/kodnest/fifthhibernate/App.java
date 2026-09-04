package com.kodnest.fifthhibernate;

import java.util.ArrayList;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        Course course1=new Course("Java");
        Course course2=new Course("Sql");
        Course course3=new Course("DSA");
        
        
        KodnestStudent kodnestStudent = new KodnestStudent("Omkar","om@om.com","9988776655");
        
        course1.setKodnestStudent(kodnestStudent);
        course2.setKodnestStudent(kodnestStudent);
        course3.setKodnestStudent(kodnestStudent);
        
        ArrayList<Course> courseList = new ArrayList<Course>();
        courseList.add(course1);
        courseList.add(course2);
        courseList.add(course3);
        
        kodnestStudent.setCourses(courseList);
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(kodnestStudent);
        transaction.commit();
        session.close();
        factory.close();
        
        
    }
    
}
