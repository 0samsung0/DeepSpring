package LearnWithXML.demo;


import LearnWithXML.demo.provider.EnglishProvider;
import LearnWithXML.demo.provider.FrenchProvider;
import LearnWithXML.demo.provider.MessageProvider;
import LearnWithXML.demo.provider.RussianProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("LearnWithXML.demo")
public class AppConfig {

    @Bean("bean1")
    public FrenchProvider frenchProvider(){
        return new FrenchProvider(66);
    }

    @Bean("bean1.5")
    public FrenchProvider frenchProvider2(){
        return new FrenchProvider();
    }

    @Primary
    @Bean("bean2")
    public EnglishProvider englishProvider(){
        return new EnglishProvider();
    }

    @Bean("bean3")
    public RussianProvider russianProvider(){
        return new RussianProvider();
    }

    @Bean("EnglishProvider")
    public MessageProvider engProvider(){
        return new EnglishProvider();
    }

}
