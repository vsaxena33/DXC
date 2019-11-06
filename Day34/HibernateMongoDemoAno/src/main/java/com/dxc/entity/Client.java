package com.dxc.entity;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		BillAmount bill1 = new BillAmount(1991, 100, 100, 9700);
		BillAmount bill2 = new BillAmount(1992, 50, 50, 6100);
		BillAmount bill3 = new BillAmount(1993, 50, 50, 1800);
		
		Set<BillAmount> allBills = new HashSet<BillAmount>();
		allBills.add(bill1);
		allBills.add(bill2);
		allBills.add(bill3);
		
		Customer customer = new Customer("Abhilash", allBills);
		
		session.save(customer);
		transaction.commit();
		
		System.out.println("Check Out It's Done");
	}
}
