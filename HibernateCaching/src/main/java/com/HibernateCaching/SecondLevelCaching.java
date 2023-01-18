package com.HibernateCaching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SecondLevelCaching {
	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ss1= sf.openSession();
		Student s1=(Student) ss1.get(Student.class, 101);
		System.out.println(s1);
		ss1.close();
		
		Session ss2= sf.openSession();
		Student s2=(Student) ss2.get(Student.class, 101);
		System.out.println(s2);
		ss2.close();
	}
}
