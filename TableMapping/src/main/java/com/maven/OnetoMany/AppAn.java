package com.maven.OnetoMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppAn {
    public static void main( String[] args ){
        ProductAn p1 = new ProductAn();
        p1.setProductId(101);
        p1.setProductName("lenevo Laptop");
        p1.setPrice(56000.90);
        
        ProductAn p2 = new ProductAn();
        p2.setProductId(102);
        p2.setProductName("Dell Laptop");
        p2.setPrice(76000.90);
        
        List<ProductAn> l = new ArrayList<ProductAn>();
        l.add(p1);
        l.add(p2);
        
        DealerAn d1= new DealerAn();
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
