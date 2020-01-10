package com.springboot.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.test.config.bean.MongoConfig;


@RestController
public class ShowConfigController {
	
	@Autowired
	MongoConfig mgoCfg;
	
	@GetMapping("/showMongoConfig")
	public String showMongoConfig() {
		
		return mgoCfg.showAllConfig();
	}

}
