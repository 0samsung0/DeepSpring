package LearnWithXML.demo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("LearnWithXML.demo")
public class AppConfig {

    @Bean
    public LoggerServece loggerService(){
        return new LoggerServece();
    }

}
