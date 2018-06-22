package com.spring;

public class FileWriter implements LogWriter {

	@Override
	public void write(String text) {
		System.out.println("Write to file: " + text);
		
	}

}
