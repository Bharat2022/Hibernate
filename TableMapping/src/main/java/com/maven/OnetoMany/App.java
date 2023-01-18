package com.maven.OnetoMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main( String[] args ){
        Product p1 = new Product();
        p1.setProductId(101);
        p1.setProductName("lenevo Laptop");
        p1.setPrice(56000.90);
        
        Product p2 = new Product();
        p2.setProductId(102);
        p2.setProductName("Dell Laptop");
        p2.setPrice(76000.90);
        
        List<Product> l = new ArrayList<Product>();
        l.add(p1);
        l.add(p2);
        
        Dealer d1= new Dealer();
        d1.setDealerId(201);
        d1.setDealerName("Bharat");
        d1.setProducts(l);
        
        Session ss = new Configuration().configure().buildSessionFactory().openSession();
        Transaction tr = ss.beginTransaction();
        ss.save(p1);
        ss.save(p2);
        ss.save(d1);
        tr.commit();
        ss.close();
        System.out.println("Successfull");
    }
}
