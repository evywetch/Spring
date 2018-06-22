package com.spring;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	
	public static void main(String[] args){
		
		/* If u use ClassPathXmlApplicationContext,it can load ur beans from any folder in the class path
		 * And u create a package to put ur bean xml files there.
		 * U can only add from the package name where u put ur beans xml.
		
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/beans/twomapsbean.xml");
		
		/*
		Person person = (Person)context.getBean("person1");
		
		person.setTaxId(666);
		
		System.out.println(person);
		
		Address address2 = (Address)context.getBean("address2");
		System.out.println(address2);
		*/
		
		/*
		FruitBasket basket = (FruitBasket) context.getBean("basket");
		System.out.println(basket.toString());
		*/
		
		Jungle3 jungle = (Jungle3) context.getBean("jungle");
		System.out.println(jungle);
		
		((ClassPathXmlApplicationContext) context).close();
		
	}

}


/*
 * -Spring lets you bold together POJO

   - Bean is a Singleton by default. If u ask 2 Person obj from container. 
u will always get the same object. 
	- Set bean scope to be "prototype" makes u be able to get new bean from each request.

	

	- If u use scope = prototype, the destroy() will not be run.
	
	- u can set global scope, init() or destroy() for ur container in xml file
	
	- 

*/