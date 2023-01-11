package com.maven.HQL;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertRec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Session ss= new Configuration().configure().buildSessionFactory().openSession();
		Transaction tr=ss.beginTransaction();
			Student s= new Student();
			s.setId(105);
			s.setName("Rohit");
			s.setPerc(35499.40);
			ss.save(s);
			tr.commit();
			System.out.println("Reecord Inserted");
	}
}
