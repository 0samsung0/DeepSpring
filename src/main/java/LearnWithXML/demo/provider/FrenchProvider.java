package LearnWithXML.demo.provider;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("fre")
public class FrenchProvider implements MessageProvider{
    @Override
    public String getMessage() {
        return "Bonjour";
    }
}
