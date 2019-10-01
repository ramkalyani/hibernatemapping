package com.zensar.hibernate.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Movie;
import com.zensar.entities.Song;

public class OneToManyMappingDemo {
	// TODO Auto-generated method stub

	public static void main(String[] args) {
		Configuration c = new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		Movie m1=new Movie();
		m1.setTitle("magadeera");
		m1.setReleaseDate(LocalDate.of(2012, 6, 23));  
		Song s1=new Song("dheera panchadr  dheera");
		Song s2=new Song("dheera panchadara  dheera");
		/*
		 * Song s1=new Song(); s1.setName("dheera"); Song s2=new Song();
		 * s2.setName("pan"); s1.setMovie(m1); s2.setMovie(m1);
		 */
		List<Song>songs=new ArrayList();
		songs.add(s1);
		songs.add(s2);
		
		m1.setSongs(songs);
		s.save(m1);
		s.save(s1);
		s.save(s2);
		
		
		t.commit();
		s.close();
	} 

}
