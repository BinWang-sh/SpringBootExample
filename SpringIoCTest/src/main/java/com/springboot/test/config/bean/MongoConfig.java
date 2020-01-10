package com.springboot.test.config.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(name="mongo.properties", value= {"classpath:config/mongo.properties"}, ignoreResourceNotFound=false, encoding="UTF-8")
public class MongoConfig {

	@Value("${mongo.url}")
	private String url;
	
	@Value("${mongo.username}")
	private String username;
	
	@Value("${mongo.password}")
	private String password;
	
	public String showAllConfig() {
		String allConfig = "mongo.url:" + url + "," + "mongo.username:"+username+"," + "mongo.password:" + password + ",";
		return allConfig;
	}
	
	public String getUrl() {
		return url;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
}
