package kom.kodnest.fourthhibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter name, email, phone of a student");
        KodnestStudent kodneststudent=new KodnestStudent(scan.next(),scan.next(),scan.next());
        System.out.println("Enter city,street,state,zipcode of student address");
        Address address=new Address(scan.next(),scan.next(),scan.next(),scan.next());
        
        kodneststudent.setAddress(address);
        
        //hibernate steps
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(kodneststudent);
        transaction.commit();
        session.close();
        factory.close();
        scan.close();
        
    }
};
