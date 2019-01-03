package luiz.com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldSpringApp {

	public static void main(String[] args) {
		
		// Load Spring Configuration 
		
		ClassPathXmlApplicationContext context =
		new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//Create the Object Bean 
		
		HandballCoach theCoach = context.getBean("myCoach",HandballCoach.class);
		
		//Use object Bean
		
		System.out.println(theCoach.getDailyFortune());
		
		
		
		//Close the Context
		context.close();

	}

}
