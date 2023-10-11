package training.spring.innova.springboot.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import training.spring.innova.springboot.properties.AppProperties;

//@Controller
//@ResponseBody

@RestController
@RequestMapping("/hello")
@RequiredArgsConstructor
public class HelloController {

    private final AppProperties appProperties;

    @GetMapping("/app")
    public AppProperties appProperties(){
        return appProperties;
    }

    // @RequestMapping(value = "/hello1",method = RequestMethod.GET)
    @GetMapping("/hello1")
    public String hello1() {
        return "Hello from controller 1 ";
    }

    @PostMapping("/hello1")
    public String hello1Post() {
        return "Hello from controller 1 POST";
    }

    @PutMapping("/hello1")
    public String hello1Put() {
        return "Hello from controller 1 PUT";
    }

    @PatchMapping("/hello1")
    public String hello1Patch() {
        return "Hello from controller 1 Patch";
    }

    @DeleteMapping("/hello1")
    public String hello1Delete() {
        return "Hello from controller 1 Delete";
    }


    @GetMapping("/hello2")
    public String hello2() {
        return "Hello from controller 2 ";
    }

}
