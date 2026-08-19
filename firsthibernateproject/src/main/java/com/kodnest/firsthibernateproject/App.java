package com.kodnest.firsthibernateproject;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Enter name, gender and salary: ");
    	Employee emp = new Employee(scan.next(),scan.next(),scan.nextInt());
    	
    	//Step:load the configuration file
    	Configuration config=new Configuration();
    	config.configure("hibernate.cfg.xml");
    	
    	//step2: create the session factory
    	SessionFactory factory = config.buildSessionFactory();
    	
    	//step3:Open the session factory
    	Session session = factory.openSession();
    	
    	
    	//step4:begin transaction
    	Transaction tran = session.beginTransaction();
    	
    	
    	//step5:perform the operation
    	session.persist(emp);
    	
    	//step6:commit the transaction
    	tran.commit();
    	
    	//step7:close session and session factory
    	
    	session.close();
    	factory.close();
    	
    }
}
