package a.b.c;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloFeatureConfig {

    @Bean
    public SpringHello springHello() {
        return new SpringHello();
    }

}
