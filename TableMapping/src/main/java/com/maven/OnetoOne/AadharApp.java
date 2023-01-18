package com.maven.OnetoOne;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AadharApp {
	 public static void main( String[] args ){
	        Session ss=new Configuration().configure().buildSessionFactory().openSession();
	        
	        Employee e= new Employee();
	        e.setPid(102);
	        e.setPname("Anukul Kumar");
	        e.setPsal(40000.89);
	      
	        Aadhar a = new Aadhar();
	        a.setAadharNumber(142326537654l);
	        a.setAddedDate(new Date());
	        a.setEmployee(e);
	        
	        Transaction tr= ss.beginTransaction();
	        	ss.save(e);
	        	ss.save(a);
	        	tr.commit();
	        ss.close();
	    }
}
