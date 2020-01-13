package com.springboot.aop.test.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.springboot.aop.test.inface.BookInfoValidator;

@Aspect
public class BookServiceAspect {

	//Introduction BookInfoValidator to BookServiceImpl
	@DeclareParents(
		value= "com.springboot.aop.test.service.BookServiceImpl",
		defaultImpl=com.springboot.aop.test.validator.BookInfoValidatorImpl.class)
	public BookInfoValidator bookInfoValidator;
	
	@Pointcut("execution(* com.springboot.aop.test.service.BookServiceImpl.showBookInfo(..))")
	public void pointCut() {
		
	}
	
	
 	@Before("pointCut()")
	public void before() {
		System.out.println("-------before.........");
	}
	
 	@Around("pointCut()")
 	public void around(ProceedingJoinPoint pjp) throws Throwable{
 		System.out.println("-------around before.........");
 		pjp.proceed();
 		System.out.println("-------around after.........");
 	}
 	
 	
 	@After("pointCut()")
	public void after() {
		System.out.println("-------after.........");
	}
 	
 	
	@AfterReturning("pointCut()")
	public void afterReturning() {
		System.out.println("-------afterReturning.........");
	}
	
	@AfterThrowing("pointCut()")
	public void afterThrowing() {
		System.out.println("-------afterThrowing.........");
	}

}
