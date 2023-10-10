package training.spring.innova.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import training.spring.innova.springboot.subpackage.HelloWorld;

// @Component
@Service
public class HelloExecutor {


    @Autowired
    @Qualifier("hhWorld")
    private HelloWorld helloWorld;

    public String executeHello(String name) {
        return "Executing : " + helloWorld.helloWorld(name);
    }

}
