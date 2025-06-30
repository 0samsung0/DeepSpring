package LearnWithXML.demo;

import LearnWithXML.demo.provider.EnglishProvider;
import LearnWithXML.demo.provider.MessageProvider;
import LearnWithXML.demo.provider.UndefinedClass;
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
//		UndefinedClass uc = ctx.getBean(
//				UndefinedClass.class
//		);  ошибка. класс не помечен как @Service-Component...
	 	//MessageProvider rp;

		//uc.find();
		gs.say();
		as.printAll();
		as.printKey();
	}


}
