package com.anncode.amazonviewer.model;

import java.sql.Date;

public class Publication {
	private String title;
	private Date editionData;
	private String editorial;
	private String[] authors;
	
	public Publication(String title, Date editionData, String editorial, String[] authors) {
		super();
		this.title = title;
		this.editionData = editionData;
		this.editorial = editorial;
		this.authors = authors;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getEditionData() {
		return editionData;
	}
	public void setEditionData(Date editionData) {
		this.editionData = editionData;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String[] getAuthors() {
		return authors;
	}
	public void setAuthors(String[] authors) {
		this.authors = authors;
	}
	
	
}
