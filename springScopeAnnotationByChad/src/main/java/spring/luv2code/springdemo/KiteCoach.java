package spring.luv2code.springdemo;

public class KiteCoach implements Coach {
	
	
	private FortuneService fortuneService;
	
	public KiteCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Run a kite for 3 hours as a warm up";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
