package com.springboot.aop.test.bean;

public class Book {
	private String id;
	private String name;
	private String author;
	
	
	public void setID(String id) {
		this.id = id;
	}
	
	public String getID() {
		return id;
	}
	
	public void setName(String bkName) {
		this.name = bkName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAuthor(String bkAuthor) {
		this.author = bkAuthor;
	}
	
	public String getAuthor() {
		return author;
	}
}
