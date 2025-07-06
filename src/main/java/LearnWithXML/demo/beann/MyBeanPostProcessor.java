package LearnWithXML.demo.beann;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String name) {
        System.out.println("BPP before: " + name);
        return bean;
    }
    @Override
    public Object postProcessAfterInitialization(Object bean, String name) {
        System.out.println("BPP after: " + name);
        return bean;
    }
}
