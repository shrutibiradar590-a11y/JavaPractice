package com.kodnest.seventhhibernate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
    	
    	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        Club club1=new Club();
        club1.setClubName("Science Club");
        
        Club club2=new Club();
        club2.setClubName("Music club");
        
        Student student = new Student();
        student.setName("Ravi Kumar");
        student.setEmail("ravikumar@gmail.com");
        
        
        Set<Club> clubs = new HashSet<>();
        clubs.add(club1);
        clubs.add(club2);
        student.setClubs(clubs);
        
        Transaction transaction = session.beginTransaction();
        session.persist(student);
        transaction.commit();
        session.close();
        factory.close();
        
        System.out.println("Students and their clubs saved successfully!");
    }
}
