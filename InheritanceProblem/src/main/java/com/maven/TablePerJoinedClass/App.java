package com.maven.TablePerJoinedClass;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    @SuppressWarnings("deprecation")
	public static void main( String[] args ){
        PEmployee pemp = new PEmployee();
        	pemp.setEmpid(103);
        	pemp.setEmpName("Abdul");
        	pemp.setEmpSal(50000.80);
        	
        CEmployee cemp = new CEmployee();
        	cemp.setEmpid(203);
        	cemp.setEmpName("Akash");
        	cemp.setHrate(1200.80);
        	
       Session ss=new Configuration().configure().buildSessionFactory().openSession();
       Transaction tr = ss.beginTransaction();
       	ss.save(pemp);
       	ss.save(cemp);
       	tr.commit();
       	ss.close();
    }
}
