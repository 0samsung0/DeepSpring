package LearnWithXML.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TimeService {


    GreetingService gS;

    @Autowired
    public TimeService(GreetingService greetingService) {
        this.gS = greetingService;
    }

    public String now(){
        System.out.println(gS.greet());
        return LocalDateTime.now().toString();
    }
}
