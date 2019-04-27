package com.anncode.amazonviewer.model;

import java.sql.Date;

public class Book extends Publication implements IVisualizable{
	
	private int id;
	
	public Book(String title, Date editionData, String editorial, String[] authors) {
		super(title, editionData, editorial, authors);
		
	}
	
	private String isbn;
	private boolean readed;
	private int timeReaded;
	
	public int getId() {
		return id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public boolean isReaded() {
		return readed;
	}

	public void setReaded(boolean readed) {
		this.readed = readed;
	}

	public int getTimeReaded() {
		return timeReaded;
	}

	public void setTimeReaded(int timeReaded) {
		this.timeReaded = timeReaded;
	}
	
	@Override
	public String toString() {
		return "::  Book  ::" +
				"Title: " + getTitle() +
				"\nEditionDate: " + getEditionData() + 
				"\nEditorial: " + getEditorial() +
				"\nAuthors: " + getAuthors();
	}

	@Override
	public java.util.Date startToSee(java.util.Date dateI) {
		return dateI;
	}

	@Override
	public void stopToSee(java.util.Date dateI, java.util.Date dateF) {
		if (dateF.getSeconds() > dateI.getSeconds()) {
			setTimeReaded(dateF.getSeconds() - dateI.getSeconds());
		}else {
			setTimeReaded(0);
		}
		
	}
	
}
