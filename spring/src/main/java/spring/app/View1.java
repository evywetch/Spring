package spring.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("TheView1")
public class View1 implements View{
	
	
	public void show(){
		
		System.out.println("Hello World");
	}

}
