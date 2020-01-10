package com.springboot.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springboot.test.bean.BookInfo;
import com.springboot.test.bean.User;
import com.springboot.test.config.AppConfig;
import com.springboot.test.config.bean.MongoConfig;
import com.springboot.test.config.bean.RedisConfig;

@SpringBootApplication
public class SpringIoCTestApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		User user = ctx.getBean(User.class);
		System.out.println(user.getId()+"");
		
		System.out.println("-----------DefaultBook------------------");
		BookInfo book = ctx.getBean(BookInfo.class);
		System.out.println(book.getID());
		System.out.println(book.getName());
		System.out.println(book.getAuthor());
				
		System.out.println("-----------MongoDB configuration----------------");
		MongoConfig mgCfg = ctx.getBean(MongoConfig.class);
		System.out.println(mgCfg.getUrl());
		System.out.println(mgCfg.getUsername());
		System.out.println(mgCfg.getPassword());
		
		SpringApplication.run(SpringIoCTestApplication.class, args);
	}

}
