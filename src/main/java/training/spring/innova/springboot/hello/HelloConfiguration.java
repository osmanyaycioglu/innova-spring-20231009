package training.spring.innova.springboot.hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("live")
public class HelloConfiguration {

    @Bean
    public IHello hello(@Value("${hello.language}") String language) {
        switch (language) {
            case "tr":
                return new TurkishHello();
            case "esp":
                return new SpanishHello();
            case "eng":
            default:
                return new EnglishHello();
        }
    }
}
