package training.spring.innova.springboot.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ValueTestConfig {

    private Environment environment;

    public ValueTestConfig(final Environment environmentParam) {
        environment = environmentParam;
    }

    public String getHelloPrefix(){
        return environment.getProperty("hello.prefix");
    }
}
