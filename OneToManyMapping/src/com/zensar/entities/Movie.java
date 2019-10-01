package com.zensar.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * @author kalyani
 * @creation_date 27 sep 2019
 * @version 1.0
 * @description It is a hibernate_one_to_one_mapping
 *
 */
@Entity
public class Movie {
	@Id
	private int movieId;
	private String title;
	private LocalDate releaseDate;
	@OneToMany(mappedBy="movie",cascade =CascadeType.ALL)
	private List<Song> songs;
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) { 
		this.movieId = movieId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate; 
	}
	public List<Song> getSongs() {
		return songs;
	} 
	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}
	
	

}
