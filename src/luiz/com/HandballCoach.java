/**
 * 
 */
package luiz.com;

/**
 * @author Broko
 *
 */
public class HandballCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailAdress;
	
	
	

	public String getEmailAdress() {
		return emailAdress;
	}


	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}


	@Override
	public String getDailyWorkout() {
		return "handball coach working out";
	}


	@Override
	public String getDailyFortune() {
		return "hand coach "+this.fortuneService.getFortuneService();
	}
	
	public void setFortuneService(FortuneService fortune) {
		fortuneService = fortune;
	}




}
