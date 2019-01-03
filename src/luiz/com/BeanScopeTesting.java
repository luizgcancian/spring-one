package luiz.com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeTesting {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanscope-applicationContext.xml");
		
		Coach soccerCoach = context.getBean("myCoach",Coach.class);
		
		System.out.println(soccerCoach.getDailyFortune());
		
		Coach soccerTwo = context.getBean("myCoach",Coach.class);
		
		System.out.println(soccerTwo.getDailyFortune());
		
		String result = (soccerCoach == soccerTwo) ? "yeah they're equal" : "no,theyre not";
		System.out.println(result);
		
		System.out.println("printing first coach "+soccerCoach);
		System.out.println("printing second coach "+soccerTwo);
		
		context.close();
		

	}

}
