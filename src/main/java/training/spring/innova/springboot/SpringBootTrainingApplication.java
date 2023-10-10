package training.spring.innova.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import training.spring.innova.springboot.subpackage.HelloWorld;
import training.test.anotherpackage.GreetingsService;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@SpringBootApplication(scanBasePackages = {"training.spring.innova.springboot",
                                           "training.test.anotherpackage"
})
public class SpringBootTrainingApplication {
    // field Injection
    @Autowired
    // @Qualifier("denemeHelloWorld")
    @Qualifier("testHello")
    private HelloWorld    hWorld;

    @Autowired
    private HelloWorld[]     helloWorlds;
//    private List<HelloWorld> helloWorlds;
    private GreetingsService greetings;
    private HelloExecutor    helloExecutor;

    // Constructor Injection
    @Autowired
    public SpringBootTrainingApplication(GreetingsService greetings) {
        this.greetings = greetings;
        System.out.println("Greeting call : " + this.greetings.greet("osman"));
        // System.out.println(helloWorld.helloWorld("osman"));
    }

    public SpringBootTrainingApplication(GreetingsService greetings,
                                         String name) {
        this.greetings = greetings;
    }

    @PostConstruct
    public void init() {
        System.out.println(hWorld.helloWorld("osman"));
    }

    @PreDestroy
    public void destroy() {
        System.out.println("öldürülüyor");
    }

    // Method Injection
    @Autowired
    public void abc(HelloExecutor helloExecutorParam) {
        helloExecutor = helloExecutorParam;
    }

    public void callAllBeans() {
        System.out.println(hWorld.helloWorld("ali"));
        System.out.println(greetings.greet("veli"));
        System.out.println(helloExecutor.executeHello("ayşe"));
        for (HelloWorld helloWorldLoc : helloWorlds) {
            System.out.println("Multiple Injection : " + helloWorldLoc.helloWorld("osman"));
        }
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootTrainingApplication.class,
                                                                                  args);
//		SpringBootTrainingApplication bean = applicationContext.getBean(SpringBootTrainingApplication.class);
//		bean.callAllBeans();


    }

}
