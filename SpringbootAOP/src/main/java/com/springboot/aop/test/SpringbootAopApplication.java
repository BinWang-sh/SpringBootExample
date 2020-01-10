package com.springboot.aop.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.springboot.aop.test.aspect.BookServiceAspect;

@SpringBootApplication
public class SpringbootAopApplication {
	
	@Bean(name="bkServiceAspect")
	public BookServiceAspect initAspect() {
		return new BookServiceAspect();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootAopApplication.class, args);
	}

}
