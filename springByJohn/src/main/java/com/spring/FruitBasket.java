package com.spring;

import java.util.*;

public class FruitBasket {
	private String name;
	private List<String> fruits;
	
	public FruitBasket(String name, List<String> fruits) {
		super();
		this.name = name;
		this.fruits = fruits;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		
		sb.append(name);
		sb.append(" contain:\n");
		
		for(String fruit:fruits){
			sb.append(fruit);
			sb.append("\n");
		}
		
		return sb.toString();
	}
	

}

/*
 				How to define a List as a contructor-arg in bean xml
 						
 1. choose contructor-arg
 2. right click at constructor-arg and choose insert <list> element
 3. right click <list> element and choose insert<value> element
 4. fill the value of the by typing Ex. <value>apple</value> , <value>kiwi</value>
 
 * U don't hv to specify class type of List , u just hv to specify it in the constructor in the class
 ** Example in fruitbean.xml
 
 */
