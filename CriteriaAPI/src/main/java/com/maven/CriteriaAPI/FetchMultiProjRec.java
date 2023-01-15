package com.maven.CriteriaAPI;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;


public class FetchMultiProjRec {
	@SuppressWarnings({ "unchecked", "deprecation" })
	public static void main(String[] args) {
		Session ss= new Configuration().configure().buildSessionFactory().openSession();
		Criteria crt= ss.createCriteria(Student.class);
		ProjectionList p1= Projections.projectionList();
			p1.add(Projections.property("name"));
			p1.add(Projections.property("perc"));
			crt.setProjection(p1);
		List<Object> ls = crt.list();
		for(Object st:ls) {
			Object[] obj=(Object[]) st;
			System.out.println(obj[0]+" , "+obj[1]);
		}
	}
}
