package com.anncode.amazonviewer.model;

import java.util.ArrayList;

public class Serie extends Film{
	
	private int id;
	private int sessionQuantity;
	private ArrayList<Chapter> chapters;
	
	public Serie(String title, String genre, String creator, int duration, int sessionQuantity) {
		super(title, genre, creator, duration);
		this.setSessionQuantity(sessionQuantity);
	}
	
	public int getId() {
		return id;
	}

	public int getSessionQuantity() {
		return sessionQuantity;
	}

	public void setSessionQuantity(int sessionQuantity) {
		this.sessionQuantity = sessionQuantity;
	}

	public ArrayList<Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(ArrayList<Chapter> chapters) {
		this.chapters = chapters;
	}

	@Override
	public String toString() {
		return "::  Serie  :" 
				+"Title: " + getTitle() +
				"\nGenero: " + getGenre() +
				"\nYear " + getYear() + 
				"\nCreator: " + getCreator() +
				"\nDuration: " + getDuration() +
				"\nSessionQuantity: " + getSessionQuantity();
	}
	
	public static ArrayList<Movie> makeMoviesList(){
		ArrayList<Movie> movies = new ArrayList<Movie>();
		for (int i=0; i<5; i++) {
			movies.add(new Movie("Movie "+(i+1), "Genero "+(i+1), "Creador "+(i+1), 120, (short) 2017));
		}
		
		return movies;
	}
	
}
