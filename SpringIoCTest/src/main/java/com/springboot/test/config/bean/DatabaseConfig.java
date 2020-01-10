package com.springboot.test.config.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("database")
public class DatabaseConfig {
	private String driverName = null;
	private String url = null;
	private String username = null;
	private String password = null;
	
	public void setDriverName(String driverName) {
		System.out.println("database.driverName:" + driverName);
		this.driverName = driverName;
	}
	
	public void setUrl(String url) {
		System.out.println("database.url:" + url);
		this.url = url;
	}
	
	public void setUsername(String username) {
		System.out.println("database.username:" + username);
		this.username = username;
	}
	
	public void setPassword(String password) {
		System.out.println("database.password:" + password);
		this.password = password;
	}
}
