package spring.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration

/* if u want to define bean in configuration class , @ComponentScan is no need
 * and no need to use @Component at each class
 *  
 */
//@ComponentScan("spring.luv2code.springdemo")

@PropertySource("classpath:sport.properties")
public class SportConfig {

	// define a bean for sad fortuneService
	// if u don't define names for a bean, the method name will be its id
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	// define a bean for swimCoach and inject dependency
	@Bean
	public Coach swimCoach() {
		
		return new SwimCoach(sadFortuneService());
	}
}
