package com.maven.NativeSQL;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class UsingPoJoClass {
	public static void main(String[] args) {
		Session ss = new Configuration().configure().buildSessionFactory().openSession();
		SQLQuery sq=ss.createSQLQuery("select * from Student1");
		sq.addEntity(Student.class);
		List<Student> ls= sq.list();
		for(Student s:ls)
			System.out.println(s.getId()+" "+s.getName()+" "+s.getPerc());
	}
}
