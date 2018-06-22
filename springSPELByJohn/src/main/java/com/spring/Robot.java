package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Robot {

	private String id = "default robot";
	private String speech = "hello";
	
	
	public void speak(){
		System.out.println(id + ":" + speech);
	}

	
// Add 	@Autowired so u can use @Value to set value of the properties directly here
// If u hv @Autowired here but dont hv @Value , u will get Exception
@Autowired
	public void setId(@Value("#{randomText.text?.length()}")String id) {
		this.id = id;
	}

@Autowired
/*
 * If u want to access static methods or properties in SPEL u hv to use "T"
 * and surroung the class with ()
 * Ex.#{T(Math).PI}
 * 
 * 
 * 
 */

// #{new java.util.Date().toString()}
	public void setSpeech(@Value("#{T(Math).sin(5)}")String speech) {
		this.speech = speech;
	}
	
	
	
}
