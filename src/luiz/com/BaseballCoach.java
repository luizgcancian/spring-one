package luiz.com;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "doing some baseball stuff";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortuneService();
	}

}
