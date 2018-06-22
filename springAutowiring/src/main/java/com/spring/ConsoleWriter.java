package com.spring;

public class ConsoleWriter implements LogWriter {

	@Override
	public void write(String text) {
		System.out.println("Write to console: " + text);
		
	}

}
