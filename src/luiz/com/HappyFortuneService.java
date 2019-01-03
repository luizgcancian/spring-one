package luiz.com;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortuneService() {
	
		Random random = new Random();
		int number = random.nextInt(3) +1;
		String fortune ="";
		
		switch(number) {
		
			case 1:
				fortune ="Returning fortune 1";
				break;
			case 2:
				fortune ="Returning fortune 2";
				break;
			case 3:
				fortune ="Returning fortune 3";
				break;
			default :
				fortune = "none of the above";
				break;
		
		
		}
		
		return fortune;
		
		
	}

}
