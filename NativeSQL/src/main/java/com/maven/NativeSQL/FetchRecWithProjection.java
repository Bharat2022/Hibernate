package com.maven.NativeSQL;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class FetchRecWithProjection {
	public static void main(String[] args) {
		Session ss = new Configuration().configure().buildSessionFactory().openSession();
		SQLQuery sq=ss.createSQLQuery("select name,perc from Student1");
		List<Object []> ls= sq.list();
		for(Object[] obj:ls)
			System.out.println(obj[0]+" "+obj[1]);
	}
}
