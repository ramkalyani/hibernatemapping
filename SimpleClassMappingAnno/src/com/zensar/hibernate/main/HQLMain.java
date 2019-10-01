package com.zensar.hibernate.main;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Product;

//hibernate query language(object oriented query language)
public class HQLMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c=new Configuration().configure();
		//singelton and heavy weight session factory
		SessionFactory f=c.buildSessionFactory();
		//represent db connection
		Session s=f.openSession();
				Transaction t=s.beginTransaction();
				//jpa query java persistance api
				//Query q=s.createQuery("from Product");
				//Query q=s.createQuery("from Product p where p.price>400 and p.price<4000");
				//Query q=s.createQuery("from Product p where p.price between 400 and 4000");
				//Query q=s.createQuery("from Product p where p.brand like 's%' ");
		/*
		 * Query q=s.createQuery("from Product p where p.name= 'mobile' ");
		 * List<Product> products=q.getResultList(); for(Product p:products) {
		 * System.out.println(p); }
		 */
				//Query q=s.createQuery("select p.name,p.price from Product p ");
				//Query q=s.createQuery("select p.name,p.price from Product p ");
				//Query= s.createQuery("select  p.productId p.name, from Product p");
		/*
		 * Query q=s.createQuery("select p.price,p.brand p.name from Product p ");
		 * List<Object> objects=q.getResultList(); for(Object ob:objects) { for(Object
		 * object:objects) { System.out.println(ob); } }
		 */
				//max 
				Query q=s.createQuery("select max(p.price) from Product p");
				Float maxprice=(Float) q.getSingleResult();
				System.out.println(maxprice);
				//minimum price
				Query q1=s.createQuery("select min(p.price) from Product p");
				Float minprice=(Float) q1.getSingleResult();
				System.out.println(minprice);
				//sum
				Query q2=s.createQuery("select sum(p.price) from Product p");
				Double sum_of_price=(Double) q2.getSingleResult();
				System.out.println(sum_of_price);
				//count
				Query q3=s.createQuery("select count(p.price) from Product p");
				Long count_of_price= (Long) q3.getSingleResult();
				System.out.println(count_of_price);
				
		/*
		 * Criteria qc=s.createCriteria(Product.class); List<Product>
		 * products=cr.list(); for(Product p:products) { System.out.println(p); }
		 */
				
						
				
				t.commit();
				s.close();
	}
	

	}


