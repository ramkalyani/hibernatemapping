package com.zensar.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Country;
import com.zensar.entities.Flag;

public class OneToOneMappingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c = new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		
		Country c1=new Country();
		c1.setName("India");
		c1.setLanguage("telugu");
		c1.setPopulation(130l); 
		
		Flag f1=new Flag();
		f1.setFlagName("national_flag");
		f1.setDescription("tri color");
		f1.setCountry(c1);
		c1.setFlag(f1);
		s.save(c1);
		s.save(f1);
				
		
		t.commit();
		s.close();
		System.exit(0);
	}

}
