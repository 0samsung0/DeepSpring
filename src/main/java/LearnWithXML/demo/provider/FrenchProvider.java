package LearnWithXML.demo.provider;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("fre")
public class FrenchProvider implements MessageProvider{

    public FrenchProvider(){

    }
    Integer b = null;
    public FrenchProvider(Integer a){
        b = a;
    }
    @Override
    public String getMessage() {
        return "Bonjour" + b;
    }
}
