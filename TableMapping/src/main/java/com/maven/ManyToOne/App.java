package com.maven.ManyToOne;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main( String[] args ){
    	StudentAddress sadd= new StudentAddress();
    	sadd.setAddress("Bangalore, India");
    	
    	Student s1= new Student();
    	s1.setSname("Bharat Kumar");
    	s1.setStudentaddress(sadd);
    	
    	Student s2= new Student();
    	s2.setSname("Anukul Kumar");
    	s2.setStudentaddress(sadd);
    	
    	Session ss= new Configuration().configure().buildSessionFactory().openSession();
    	Transaction tr = ss.beginTransaction();
    	ss.save(s1);
    	ss.save(s2);
    	tr.commit();
    	ss.close();
    }
}
