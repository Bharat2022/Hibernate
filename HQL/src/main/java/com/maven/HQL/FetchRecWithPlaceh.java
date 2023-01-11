package com.maven.HQL;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class FetchRecWithPlaceh {
	public static void main(String[] args) {
		Session ss= new Configuration().configure().buildSessionFactory().openSession();
		Query qr=ss.createQuery("from Student where id=:d");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter student id :");
		int sid=sc.nextInt();
		qr.setParameter("d", sid);
		List<Student> ls=qr.list();
		
		try {
			Student s=ls.get(0);
			System.out.println(s.getId()+" "+s.getName()+" "+s.getPerc());
		} catch (Exception e) {
			System.out.println("Invaild id");
		}
	}
}
