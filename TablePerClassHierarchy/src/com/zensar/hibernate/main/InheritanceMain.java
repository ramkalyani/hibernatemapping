package com.zensar.hibernate.main;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Employee;
import com.zensar.entities.WageEmp;

public class InheritanceMain {

	public static void main(String[] args) {
		Configuration c = new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		Employee e=new Employee();
		e.setName("kalyani");
		e.setJoinDate(LocalDate.of(1997, 5, 19));
		e.setSalary(50000);
		s.save(e);
		
		WageEmp we=new WageEmp();
		we.setName("devi");
		we.setJoinDate(LocalDate.of(1999, 1, 13));
		we.setSalary(600000);
		we.setHours(12);
		we.setRate(5000);
		s.save(we);
		t.commit();
		s.close();
		// TODO Auto-generated method stub

	}

}
