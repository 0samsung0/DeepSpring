package LearnWithXML.demo;

import LearnWithXML.demo.provider.EnglishProvider;
import LearnWithXML.demo.provider.MessageProvider;
import LearnWithXML.demo.service.AdvancedService;
import LearnWithXML.demo.service.GreetingService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(
						AppConfig.class);
		GreetingService gs = ctx.getBean(
				GreetingService.class);
		AdvancedService as = ctx.getBean(
				AdvancedService.class);

		//MessageProvider rp;

		gs.say();
		as.printAll();
		as.printKey();
	}


}
