package com.maven.HQL;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertOnetoOtherTab {
	public static void main(String[] args) {
		Session ss= new Configuration().configure().buildSessionFactory().openSession();
		Transaction tr = ss.beginTransaction();
		Query qr=ss.createQuery("insert into StudentBackup(xid,xname,xperc)"+"select s.id,s.name,s.perc from Student s");
		int row=qr.executeUpdate();
		tr.commit();
		System.out.println("Number of records inserted : "+row);
	}
}
