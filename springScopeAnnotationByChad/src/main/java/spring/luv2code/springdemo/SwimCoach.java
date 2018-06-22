package spring.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	
	/* Use @Value with String email, team coz we want to inject 
	 * thier actual values from the properties file
	 * - ${foo.email} is the property name  in properties file
	 */
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	/*
	 * We don't use @Autowired with fortuneService in this case
	 * coz we already wired the beans in the config class
	 * 
	 */
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "swim 1000 meters as a warm up";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
	
	

}
