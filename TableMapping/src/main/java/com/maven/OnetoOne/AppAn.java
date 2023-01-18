package com.maven.OnetoOne;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppAn {
    public static void main( String[] args ){
        Session ss=new Configuration().configure().buildSessionFactory().openSession();
        	
        PersonAn p=new PersonAn();
        	p.setPersonName("Bharat");
        	p.setPersonId(101);
        
        LicenseAn l=new LicenseAn();
         	l.setExpireDate(new Date());
         	l.setIssuseDate(new Date());
         	l.setPerson(p);
        
        Transaction tr= ss.beginTransaction();
        	ss.save(p);
        	ss.save(l);
        	tr.commit();
        ss.close();
    }
}
