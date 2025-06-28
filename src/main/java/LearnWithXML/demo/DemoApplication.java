package LearnWithXML.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annContext
				= new AnnotationConfigApplicationContext(
						AppConfig.class);

		GreetingService gs = annContext.getBean(
				GreetingService.class);
		TimeService ts = annContext.getBean(TimeService.class);

		System.out.println(gs.greet() +" ++++++"+ ts.now());
	}


}
