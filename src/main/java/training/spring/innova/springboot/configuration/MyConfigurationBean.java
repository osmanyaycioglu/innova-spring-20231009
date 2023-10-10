package training.spring.innova.springboot.configuration;

import a.b.c.HelloFeatureConfig;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;
import training.spring.innova.springboot.subpackage.HelloWorld;
import training.spring.innova.springboot.subpackage.UnExpectedBean;
import training.test.anotherpackage.GreetingsService;

@Configuration
@Import({HelloFeatureConfig.class})
public class MyConfigurationBean {

    private UnExpectedBean unExpectedBean;
    @Value("${gen.hello.prefix}")
    private String         prefix;

    public MyConfigurationBean(final UnExpectedBean unExpectedBeanParam) {
        unExpectedBean = unExpectedBeanParam;
    }

    @Scope("singleton")
    @Bean("hhWorld")
    @Qualifier("testHello")
    // @Primary
    public HelloWorld createHelloWorld(GreetingsService greetingsParam,
                                       @Value("#{valueTestConfig.getHelloPrefix()}") String prefix,
                                       ValueTestConfig testConfigParam) {
        String helloPrefixLoc = testConfigParam.getHelloPrefix();
        System.out.println("Greetings geldi : " + greetingsParam.greet("osman"));
        return new HelloWorld(prefix);
    }

    @Bean
    public HelloWorld denemeHelloWorld(@Value("${hello.prefix}") final String prefixParam) {
        return new HelloWorld(prefixParam);
    }

}
