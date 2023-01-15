package com.maven.TablePerConcreteClass;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    @SuppressWarnings("deprecation")
	public static void main( String[] args ){
    	Employee emp = new Employee();
    		emp.setEmpid(001);
    		emp.setEmpName("Bharat");
    		
        PEmployee pemp = new PEmployee();
        	pemp.setEmpid(101);
        	pemp.setEmpName("Anukul");
        	pemp.setEmpSal(60000.80);
        	
        CEmployee cemp = new CEmployee();
        	cemp.setEmpid(201);
        	cemp.setEmpName("Akashay");
        	cemp.setHrate(1200.80);
        	
       Session ss=new Configuration().configure().buildSessionFactory().openSession();
       Transaction tr = ss.beginTransaction();
       	ss.save(emp);
       	ss.save(pemp);
       	ss.save(cemp);
       	tr.commit();
       	ss.close();
    }
}
