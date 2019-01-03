package luiz.com;

public class SoccerCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public SoccerCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Training penaltis";
	}

	@Override
	public String getDailyFortune() {
		return "just do it! "+fortuneService.getFortuneService();
	}
	
	// INIT AND DESTROY CUSTOM METHODS //
	
	public void startPlease() {
		System.out.println("starting with init method");
	}
	
	public void finishPlease() {
		System.out.println("closing with destroy method");
	}

}
