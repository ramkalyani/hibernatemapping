package com.zensar.daos;


import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.User;
/**
 * @author kalyani
 * @version 2.0
 * @creation_date 21st September 2019 5:37PM
 * @modification_date 28st september 2019 10.20AM
 * @copyright Zensar Technologies. All rights reserved.
 * @description It is Data Access Object Interface implimentor class.
 * 				It is used in Persistence Layer.
 */


public class UserDaoImpl implements UserDao {
	private Session session;
	public UserDaoImpl() {
		// TODO Auto-generated constructor stub
		Configuration c=new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		session  = f.openSession();
		
		
		
	}

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
	Transaction t= session.beginTransaction();
				session.save(user);
		t.commit();
		
	}

	@Override
	public void update(User user) {
		
		// TODO Auto-generated method stub
		Transaction t = session.beginTransaction();
		session.update(user);
		t.commit();
		
		
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		Transaction t = session.beginTransaction();
		session.delete(user);
		t.commit();
		
	}

	@Override
	public User getbyUsername(String username) {
		// TODO Auto-generated method stub
		return session.get(User.class,username);
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		Query q=session.createQuery("from user");
		return  q.getResultList();
	}
	
	
	
}