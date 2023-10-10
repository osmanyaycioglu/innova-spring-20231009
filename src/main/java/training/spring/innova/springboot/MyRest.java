package training.spring.innova.springboot;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import training.spring.innova.springboot.subpackage.UnExpectedBean;
import training.test.anotherpackage.GreetingsService;

@RestController
@RequestMapping("/my")
public class MyRest {

    private GreetingsService greetings;
    private UnExpectedBean   unExpectedBean;
    private Environment environment;

    public MyRest(GreetingsService greetings, UnExpectedBean unExpectedBean, Environment environment) {
        this.greetings = greetings;
        this.unExpectedBean = unExpectedBean;
        this.environment = environment;
    }

    @GetMapping("/hello")
    public String hello(){
        return  "hello from innova";
    }


    @GetMapping("/greet/osman")
    public String greetOsman(){
        return greetings.greet("osman");
    }

}
