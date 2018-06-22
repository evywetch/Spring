package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/beans/beans2.xml");
		
		Robot robot = (Robot) context.getBean("robot");

		robot.speak();
		
		((ClassPathXmlApplicationContext) context).close();
	}

}