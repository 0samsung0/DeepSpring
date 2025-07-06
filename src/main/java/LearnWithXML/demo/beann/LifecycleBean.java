package LearnWithXML.demo.beann;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
public class LifecycleBean {

    @PostConstruct
    public void onInit(){
        System.out.println(">> LifecycleBean @PostConstruct");
    }

    @PreDestroy
    public void onDestroy(){
        System.out.println(">> LifecycleBean @PreDestroyer");
    }


}
