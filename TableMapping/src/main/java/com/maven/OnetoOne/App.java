package com.maven.OnetoOne;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main( String[] args ){
        Session ss=new Configuration().configure().buildSessionFactory().openSession();
        License l=new License();
        	l.setLicenseId(101);
        	l.setExpireDate(new Date());
        	l.setIssuseDate(new Date());
        	
        Person p=new Person();
        	p.setPersonName("Bharat");
        	p.setLicense(l);
        	
        Transaction tr= ss.beginTransaction();
        	ss.save(l);
        	ss.save(p);
        	tr.commit();
        ss.close();
    }
}
