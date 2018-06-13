package spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	
	Controller controller;
	
	public Application(Controller controller){
		this.controller = controller;
	}

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/resource/application.xml");

		Application application =  context.getBean(Application.class);
		application.getView();
	}
	
	public void getView(){
		controller.showView();
	}

}
