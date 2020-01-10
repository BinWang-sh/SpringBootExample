package com.springboot.test.config.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RedisConfig {

	@Value("${redis.url")
	private String url = null;
	
	
	private String username = null;
	
	
	private String password = null;
	
	private long expiredMinutes = 0;
	
	
	public void setUrl(String url) {
		System.out.println("Redis.url:" + url);
		this.url = url;
	}
	
	@Value("${redis.username}")
	public void setUsername(String username) {
		System.out.println("Redis.username:" + username);
		this.username = username;
	}
	
	@Value("${redis.password}")
	public void setPassword(String password) {
		System.out.println("Redis.password:" + password);
		this.password = password;
	}
	
}
