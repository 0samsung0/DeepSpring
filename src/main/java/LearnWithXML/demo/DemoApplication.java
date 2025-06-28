package LearnWithXML.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("beans.xml");
		GreetingService gs =
				ctx.getBean("greetingService", GreetingService.class);
		TimeService ts =
				ctx.getBean("timeService", TimeService.class);
		System.out.println(gs.greet() + " --- " + ts.now());
		ctx.close();
	}


}
