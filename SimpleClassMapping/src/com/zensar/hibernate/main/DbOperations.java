package com.zensar.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Product;

public class DbOperations {

	public static void main(String[] args) {
		Configuration c=new Configuration().configure();
		//singelton and heavy weight session factory
		SessionFactory f=c.buildSessionFactory();
		//represent db connection
		Session s=f.openSession();
				Transaction t=s.beginTransaction();
				//insert new record
				//Product p = new Product(1007,"mobile","honor", 80000);
				
				//s.save(p);
				//get record according to primary key
		/*
		 * Product p=s.get(Product.class, 1004); if(p.equals(null)) {
		 * 
		 * //Product p=s.load(Product.class, 1004);
		 * System.out.println("record not found"); } else { System.out.println(p); }
		 */
				//update 
		/*
		 * Product p=s.get(Product.class, 1004); if(p!=null) {
		 * 
		 * p.setPrice(p.getPrice()+200);
		 * 
		 * //s.update(p); //Product p=s.load(Product.class, 1004);
		 * 
		 * } else {
		 * 
		 * System.out.println("product not found"); }
		 */
				
				//delete record
				Product p=s.get(Product.class,1007);
				if(p!=null) 
				{
					s.delete(p);
				}
		t.commit();
		s.close();
		
		// TODO Auto-generated method stub

	}

}
