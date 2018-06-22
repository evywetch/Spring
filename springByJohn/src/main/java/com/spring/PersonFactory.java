package com.spring;

public class PersonFactory {
	
	// a factory() in Factory must be " non-static"
	public Person createPerson(int id, String name){
		System.out.println("use this factory to create person.");
		
		return new Person(id,name);
	}

}
