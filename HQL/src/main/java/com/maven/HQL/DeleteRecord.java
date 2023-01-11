package com.maven.HQL;

import java.util.Scanner;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteRecord {
	public static void main(String[] args) {
		Session ss= new Configuration().configure().buildSessionFactory().openSession();
		Transaction tr = ss.beginTransaction();
		Query qr=ss.createQuery("delete Student where id=:d");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter student id :");
		int sid=sc.nextInt();
		qr.setParameter("d", sid);
		int row =qr.executeUpdate();
		tr.commit();
		System.out.println("Number of record deleted is :"+row);
	}
}
