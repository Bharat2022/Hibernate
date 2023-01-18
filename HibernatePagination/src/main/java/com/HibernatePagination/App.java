package com.HibernatePagination;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main( String[] args ){
    	Session ss= new Configuration().configure().buildSessionFactory().openSession();
		Query qr=ss.createQuery("from Student");
		qr.setFirstResult(0);
		qr.setMaxResults(2);
		List<Student> ls=qr.list();
		for(Student st:ls) 
			System.out.println(st.getId()+" "+st.getName()+" "+st.getPerc());
    }
}
