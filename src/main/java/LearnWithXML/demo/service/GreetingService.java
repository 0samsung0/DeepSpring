package LearnWithXML.demo.service;

import LearnWithXML.demo.provider.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

//    @Autowired
//    @Qualifier("bean2")
//    MessageProvider mp;

    public void say(){
        System.out.println("mp.getMessage()");
    }
}
