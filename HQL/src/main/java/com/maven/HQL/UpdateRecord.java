package com.maven.HQL;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateRecord {
	public static void main(String[] args) {
		Session ss= new Configuration().configure().buildSessionFactory().openSession();
		Transaction tr =ss.beginTransaction();
		Query qr=ss.createQuery("update Student set perc = 55.8 where id=105");
			int row =qr.executeUpdate();
			tr.commit();
		System.out.println("Number of record update is :"+row);
	}
}
