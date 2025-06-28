package LearnWithXML.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    LoggerServece lg;

    @Autowired
    GreetingService(LoggerServece lgg){
        lg = lgg;
    }


    public void init() { System.out.println("GreetingService init"); }
    public String greet() { lg.Hi(); return "Hello!"; }
    public void cleanup() { System.out.println("GreetingService destroy"); }
}
