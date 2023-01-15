package com.maven.CriteriaAPI;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class FetchRecWithCond {
	@SuppressWarnings({ "unchecked", "deprecation" })
	public static void main(String[] args) {
		Session ss= new Configuration().configure().buildSessionFactory().openSession();
		Criteria crt= ss.createCriteria(Student.class);
		Criterion cri=(Criterion) Restrictions.gt("perc", 70.0);
			crt.add(cri);
		List<Student> ls = crt.list();
		for(Student st:ls)
    		System.out.println(st.getId()+" "+st.getName()+" "+st.getPerc());
	}
}
