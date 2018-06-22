package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/beans/beans.xml");
		
		
		Logger3 logger = (Logger3)context.getBean("logger");
		
		logger.writeConsole("Hello there");
		logger.writeFile("Hi agian");
		
		
		
		((ClassPathXmlApplicationContext) context).close();
		

	}

}
