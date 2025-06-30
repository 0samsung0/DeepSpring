package LearnWithXML.demo.provider;

import LearnWithXML.demo.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component("eng")
public class EnglishProvider implements MessageProvider{

    @Override
    public String getMessage() {
        return "Hello";
    }
}
