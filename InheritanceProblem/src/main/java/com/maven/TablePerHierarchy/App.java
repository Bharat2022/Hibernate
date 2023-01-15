package com.maven.TablePerHierarchy;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    @SuppressWarnings("deprecation")
	public static void main( String[] args ){
        PEmployee pemp = new PEmployee();
        	pemp.setEmpid(102);
        	pemp.setEmpName("Anukul");
        	pemp.setEmpSal(50000.80);
        	
        CEmployee cemp = new CEmployee();
        	cemp.setEmpid(202);
        	cemp.setEmpName("Akashay");
        	cemp.setHrate(1200.80);
        	
       Session ss=new Configuration().configure().buildSessionFactory().openSession();
       Transaction tr = ss.beginTransaction();
       	ss.save(pemp);
       	ss.save(cemp);
       	tr.commit();
       	ss.close();
    }
}
