package com.springboot.test.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.springboot.test.bean.BookInfo;

@Configuration
@ComponentScan("com.springboot.test.bean,com.springboot.test.config.bean")
public class AppConfig {
	@Bean(name="defaultBook")
	public BookInfo initDefBook() {
		BookInfo bk = new BookInfo();
		
		bk.setID("bk323411");
		bk.setName("Crazy Spring Boot");
		bk.setAuthor("Crazy Max");
		
		return bk;
	}
	
	@Bean(name="dataSource")
	@Conditional(DatabaseConditional.class)
	public Properties loadDataSource(
			@Value("${database.driverName}") String driver,
			@Value("${database.url") String url,
			@Value("${database.username}") String username,
			@Value("${database.password}") String password
			) {
		
		Properties props = new Properties();
		props.setProperty("driverName", driver);
		props.setProperty("usrl", url);
		props.setProperty("username", username);
		props.setProperty("password", password);
		
		return props;
	}
}
