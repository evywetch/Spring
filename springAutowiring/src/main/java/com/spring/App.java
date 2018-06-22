package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/beans/logger4bean.xml");
	
		
	Logger4 logger = (Logger4)context.getBean("logger");
	
	logger.writeConsole("Hello there");
	logger.writeFile("Hi agian");
	
	
	
	((ClassPathXmlApplicationContext) context).close();
	
	}

}