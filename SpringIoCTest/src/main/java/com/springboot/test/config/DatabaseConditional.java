package com.springboot.test.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class DatabaseConditional implements Condition{

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		// TODO Auto-generated method stub
		
		Environment env = context.getEnvironment();
		
		boolean allRequirements = env.containsProperty("database.driverName")
				&& env.containsProperty("database.url")
				&& env.containsProperty("database.username")
				&& env.containsProperty("database.password");
		
		if(allRequirements) {
			System.out.println("Meet all database requirements");
		} else {
			System.out.println("Not all database requirements been met");
		}
		return allRequirements;
	}

}
