package training.spring.innova.springboot.subpackage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
    private String prefix;

    public HelloWorld(@Value("${hello.prefix}") final String prefixParam) {
        prefix = prefixParam;
    }

    public String helloWorld(String name){
        return prefix + " " + name;
    }

}
