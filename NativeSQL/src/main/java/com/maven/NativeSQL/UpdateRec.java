package com.maven.NativeSQL;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateRec {
	public static void main(String[] args) {
		Session ss = new Configuration().configure().buildSessionFactory().openSession();
		SQLQuery sq=ss.createSQLQuery("update Student1 set perc=99.6 where id=101");
		Transaction tr= ss.beginTransaction();
		int r=sq.executeUpdate();
		tr.commit();
		ss.close();
		System.out.println("no. of record affacted : "+r);
	}
}
