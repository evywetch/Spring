package spring.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KiteCoachConfig {

	@Bean
	public FortuneService chalalaFortuneService() {
		return new ChalalaFortuneService();
	}
	
	@Bean
	public Coach kiteCoach() {
		return new KiteCoach(chalalaFortuneService());
	}
}
