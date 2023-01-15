package com.maven.NativeSQL;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.type.StandardBasicTypes;

public class ProjWithConvertObjecttoEqType {
	public static void main(String[] args) {
		Session ss = new Configuration().configure().buildSessionFactory().openSession();
		SQLQuery sq=ss.createSQLQuery("select name,perc from Student1");
			sq.addScalar("name",StandardBasicTypes.STRING);
			sq.addScalar("perc",StandardBasicTypes.DOUBLE);
		List<Object[]> ls= sq.list();
		for(Object[] s:ls)
			System.out.println(s[0]+" "+s[1]);
	}
}
