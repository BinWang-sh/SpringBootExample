package com.example.demo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="users")
public class User {
	
	private String usrid;
	private String name;
	private String address;
	private int age;
	private boolean isMan;
	
	
	public User(String name, String addr, int age, boolean isMan) {
		this.name = name;
		this.address = addr;
		this.age = age;
		this.isMan = isMan;
	}
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="usrid", nullable = false)
	public String getUsrid() {
		return usrid;
	}
	
	public void setUsrid(String id) {
		this.usrid = id;
	}
	
	@Column(name="name", nullable=false)
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="age")
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

}
