package luiz.com;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run 5km per day";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortuneService();
	}

}
