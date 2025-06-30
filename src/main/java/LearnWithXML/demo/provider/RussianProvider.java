package LearnWithXML.demo.provider;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("rus")
public class RussianProvider implements MessageProvider{
    @Override
    public String getMessage() {
        return "Привет";
    }
}
