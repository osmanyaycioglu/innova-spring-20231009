package training.spring.innova.springboot.hello;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello/say")
@RequiredArgsConstructor
public class HelloApiController {

    private final IHello hello;

    @GetMapping("/hello")
    public String sayHello(@RequestParam String name,
                           @RequestParam String surname) {
        return hello.sayHello(name,
                              surname);
    }

    @GetMapping("/goodbye")
    public String sayGoodbye(@RequestParam String name,
                             @RequestParam String surname) {
        return hello.sayGoodbye(name,
                                surname);
    }

}
