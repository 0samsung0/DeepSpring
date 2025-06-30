package LearnWithXML.demo.service;

import LearnWithXML.demo.provider.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import javax.*;
import java.util.List;
import java.util.Map;

@Service
public class AdvancedService {
    @Autowired
    private List<MessageProvider> providers;

    @Autowired
    private MessageProvider ip;

    @Autowired
    private Map<String,MessageProvider> providerMap;

    public void printAll(){
        System.out.println("printAll::::::::::");
        providers
                .stream()
                .forEach(System.out::println);
    }

    public void printKey(){
        System.out.print("Key:::::::::::");
        providerMap.keySet().stream().forEach(
                System.out::println
        );
    }
}
