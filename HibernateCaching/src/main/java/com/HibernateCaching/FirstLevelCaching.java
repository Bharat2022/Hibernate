package com.HibernateCaching;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class FirstLevelCaching {
    public static void main( String[] args ){
    	Session ss= new Configuration().configure().buildSessionFactory().openSession();
		Student student=(Student) ss.get(Student.class,101);
		System.out.println(student);
		
		System.out.println("Working somthing...");
		Student student1=(Student) ss.get(Student.class,101);
		System.out.println(student1);
		
		System.out.println(ss.contains(student));
    }
}
