package training.spring.innova.springboot.hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class HelloConfigurationDev {

    @Bean
    public IHello hello(@Value("${hello.language}") String language) {
        return new EnglishHello();
    }
}
