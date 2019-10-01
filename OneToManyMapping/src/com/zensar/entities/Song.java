package com.zensar.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author kalyani
 * @creation_date 27 sep 2019
 * @creation_time 4.00pm
 * @version 1.0
 * @description It is a one_to_many_mapping example
 *
 */
@Entity
public class Song {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int songId;
	private String name;
	@ManyToOne
	@JoinColumn(name = "movieId")
	private Movie movie;
	public Song() {
		// TODO Auto-generated constructor stub
	}
	
	public Song(String name) {
		super();
		this.name = name;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Song(int songId, String name) {
		super();
		this.songId = songId;
		this.name = name;
	}
	public int getSongId() {
		return songId;
	}
	public void setSongId(int songId) {
		this.songId = songId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Song [songId=" + songId + ", name=" + name + "]";
	}
	
	

}
