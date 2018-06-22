package com.spring;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("fileWriter3")
public class FileWriter implements LogWriter {

	public void write(String text) {
		System.out.println("Write to file: " + text);
		
	}

}
