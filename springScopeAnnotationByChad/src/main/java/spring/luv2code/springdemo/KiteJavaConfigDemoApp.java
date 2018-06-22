package spring.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KiteJavaConfigDemoApp {

	public static void main(String[] args) {
		// read spring config java class
				AnnotationConfigApplicationContext context = 
						new AnnotationConfigApplicationContext(KiteCoachConfig.class);
				
				// get the bean from spring container
			//	Coach theCoach = context.getBean("swimCoach", Coach.class);
				
				KiteCoach theCoach = context.getBean("kiteCoach", KiteCoach.class);
				
				// call a method on the bean
				System.out.println(theCoach.getDailyWorkout());

				// call method to get daily fortune
				System.out.println(theCoach.getDailyFortune());
				
				
					
				// close the context
				context.close();	


	}

}
