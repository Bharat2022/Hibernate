package com.maven.ManytoMany;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppAn {
    @SuppressWarnings("deprecation")
	public static void main( String[] args ){
    	Employee e1= new Employee();
    	e1.setEid(101);
    	e1.setEname("Ram");
    	
    	Employee e2= new Employee();
    	e2.setEid(102);
    	e2.setEname("Shyam");
    	
    	Project p1= new Project();
    	p1.setPid(201);
    	p1.setPname("Chat bot");
    	
    	Project p2= new Project();
    	p2.setPid(202);
    	p2.setPname("E-Commerce");
    	
    	List<Employee> list1=new ArrayList<Employee>();
    	list1.add(e1);
    	list1.add(e2);
    	
    	List<Project> list2=new ArrayList<Project>();
    	list2.add(p1);
    	list2.add(p2);
    	
    	e1.setProjects(list2);
    	e2.setProjects(list2);
    	p2.setEmployees(list1);
    	p2.setEmployees(list1);
    	
    	Session ss = new Configuration().configure().buildSessionFactory().openSession();
        Transaction tr = ss.beginTransaction();
         ss.save(e1);
         ss.save(e2);
         ss.save(p1);
         ss.save(p2);
         tr.commit();
         ss.close();
         System.out.println("Successfull");
    }
}
