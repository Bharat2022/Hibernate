package com.maven.ManytoMany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main( String[] args ){
    	Student s1 = new Student();
    	s1.setSid(101);
    	s1.setSname("Bharat");
    	
    	Student s2 = new Student();
    	s2.setSid(102);
    	s2.setSname("Anukul");
    	
    	Student s3 = new Student();
    	s3.setSid(103);
    	s3.setSname("Sonu");
    	
    	Course c1 = new Course();
    	c1.setCid(201);
    	c1.setCname("Java");
    	
    	Course c2 = new Course();
    	c2.setCid(202);
    	c2.setCname("Python");
    	
    	Set<Course> cs = new HashSet<Course>();
    	cs.add(c1);
    	cs.add(c2);
    	
    	s1.setCourses(cs);
    	s2.setCourses(cs);
    	s3.setCourses(cs);
    	Session ss = new Configuration().configure().buildSessionFactory().openSession();
        Transaction tr = ss.beginTransaction();
         ss.save(c1);
         ss.save(c2);
         ss.save(s1);
         ss.save(s2);
         ss.save(s3);
         tr.commit();
         ss.close();
         System.out.println("Successfull");
    }
}
