package com.springboot.test.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("user")
public class User {
	
	@Value("1")
	private Long id;
	
	@Value("user_name_1")
	private String name;
	
	@Value("note_1")
	private String note;
	
	public Long getId() {
		return id;
	}
}
