package com.maven.CriteriaAPI;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class FetchSingleRecWithCond {
	@SuppressWarnings({ "unchecked", "deprecation" })
	public static void main(String[] args) {
		Session ss= new Configuration().configure().buildSessionFactory().openSession();
		Criteria crt= ss.createCriteria(Student.class);
			crt.add(Restrictions.gt("perc", 70.0));
			crt.setProjection(Projections.property("name"));
		List<String> ls = crt.list();
		for(String st:ls)
    		System.out.println(st);
	}
}
