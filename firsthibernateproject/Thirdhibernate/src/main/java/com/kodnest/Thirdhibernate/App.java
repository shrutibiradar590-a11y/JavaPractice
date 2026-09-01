package com.kodnest.Thirdhibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        // ---- STEP 1: INSERT 2 Employees ----
        Employee e1 = new Employee();
        e1.setName("Ranju");
        e1.setSalary(45000);
        e1.setDesignation("Developer");
        e1.setDepartment("IT");

        Employee e2 = new Employee();
        e2.setName("Amit");
        e2.setSalary(60000);
        e2.setDesignation("Manager");
        e2.setDepartment("HR");

        session.save(e1);
        session.save(e2);
        System.out.println("2 Employees Inserted Successfully");

        // ---- STEP 2: DELETE Employee with id=1 ----
        // Note: After save, id will be auto-generated as 1 and 2
        Employee empToDelete = session.get(Employee.class, 1);
        
        if (empToDelete != null) {
            session.delete(empToDelete);
            System.out.println("Employee with id 1 deleted Successfully");
        } else {
            System.out.println("Employee with id 1 does not Exist");
        }

        transaction.commit();
        session.close();
        factory.close();
    }
}