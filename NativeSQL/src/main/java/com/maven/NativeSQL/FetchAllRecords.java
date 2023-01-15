package com.maven.NativeSQL;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class FetchAllRecords {
	public static void main(String[] args) {
		Session ss = new Configuration().configure().buildSessionFactory().openSession();
		SQLQuery sq=ss.createSQLQuery("select * from Student1");
		List<Object[]> ls=sq.list();
		for(Object[] obj:ls) {
			for(Object ob:obj)
				System.out.print(ob+" ");
			System.out.println();
		}
	}
}
