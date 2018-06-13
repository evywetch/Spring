package spring.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.*;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

/*
 * The @ComponentScan is used for a class that starts the IoC container.
 */
@ComponentScan
public class Application {
	// @Autowired tells that Controller object will be injected to Application
	@Autowired  Controller controller;

	public static void main(String[] args) {
		
		ApplicationContext context = new
				AnnotationConfigApplicationContext(Application.class);
		
		Application app = context.getBean (Application.class);
		app.start();
	}
	
	public void start(){
		
		
		 controller.showView();
		
	}
	
	@Bean(name ={"TheBean","Bunnie"})
	public View getView () {
		
		return new View2 (); }

}

/* 
 * - @Component  = means the class that has this annotation will be managed 
 *    by IoC container
 * - So u don't have to add the class with @Component in the constructor of 
 *   AnnotationConfigApplicationContext
 */
 

