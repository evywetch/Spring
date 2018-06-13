package com.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		System.out.println("config loaded");
		
		Sim sim = context.getBean("sim",Sim.class);
		sim.calling();
		sim.data();
	}
}


/*
@@@@IoC Container is going to read the config files(Ex. xml files)
 then create objects(beans) based on the config files.

*/