package com.spring;

public class Logger3 {

	/* 					Autowiring by constructor(logger3bean.xml)
	 * 
	 * ** Autowiring by constructor works by type 
	 *   You have to specify the exactly type, can't be ambiguity ex. interface type
	 
	 */
	private LogWriter consoleWriter;
	private LogWriter fileWriter;
	
	public Logger3(ConsoleWriter consoleWriter,FileWriter fileWriter){
		
		this.consoleWriter = consoleWriter;
		this.fileWriter = fileWriter;
	}
	
	
	public void setConsoleWriter(LogWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}
	public void setFileWriter(LogWriter fileWriter) {
		this.fileWriter = fileWriter;
	}
	
	public void writeFile(String text){
		fileWriter.write(text);
	}
	public void writeConsole(String text){
		consoleWriter.write(text);
	}
}
