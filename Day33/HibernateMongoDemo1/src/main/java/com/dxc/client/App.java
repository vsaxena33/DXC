package com.dxc.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.ogm.cfg.OgmConfiguration;

import com.dxc.model.Customer;

//import com.dxc.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
        OgmConfiguration cfg = new OgmConfiguration();
        cfg.configure();
        
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        
        Transaction transaction = session.beginTransaction();
        
        Customer customer = new Customer(1997, "Vaibhav", "Raipur", "2000");
        session.save(customer);
//        Employee employee = new Employee(19187, "Subeksha", "Pune", 96000);
//        session.save(employee);
        
        transaction.commit();
        
        System.out.println("Data stored in mongobd");
    }
}
