package com.anncode.amazonviewer.model;

import java.sql.Date;

public class Magazine extends Publication{

	private int id;
	
	public Magazine(String title, Date editionData, String editorial, String[] authors) {
		super(title, editionData, editorial, authors);
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "::  Magazine  ::" +
				"Title: " + getTitle() +
				"\nEditionDate: " + getEditionData() + 
				"\nEditorial: " + getEditorial() +
				"\nAuthors: " + getAuthors();
	}
}
