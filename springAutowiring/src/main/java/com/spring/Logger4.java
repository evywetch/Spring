package com.spring;

public class Logger4 {

	// How to set default autowiring
	private ConsoleWriter consoleWriter;
	private FileWriter fileWriter;
	
	
	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}
	public void setFileWriter(FileWriter fileWriter) {
		this.fileWriter = fileWriter;
	}
	
	public void writeFile(String text){
		fileWriter.write(text);
	}
	public void writeConsole(String text){
		consoleWriter.write(text);
	}
}