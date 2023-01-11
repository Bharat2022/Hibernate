package com.maven.HQL;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class FetchSingleRec {
	public static void main(String[] args) {
		Session ss= new Configuration().configure().buildSessionFactory().openSession();
		Query qr=ss.createQuery("select s.name,s.perc from Student s");
		List<Object> ls=qr.list();
		for(Object ob:ls) {
			Object b[]= (Object[])ob;
			System.out.println(b[0]+" "+b[1]);
		}
	}
}
