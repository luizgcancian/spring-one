package luiz.com;

public class TenisCoach implements Coach {
	
	private FortuneService fortuneService;
	

	@Override
	public String getDailyWorkout() {
		return "doing tenis workout";
	}

	@Override
	public String getDailyFortune() {
		return "tenis coach "+fortuneService.getFortuneService();
	}
	
	public void setFortuneService(FortuneService fortune) {
		this.fortuneService = fortune;
	}

}
