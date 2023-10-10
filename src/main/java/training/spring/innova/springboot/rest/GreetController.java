package training.spring.innova.springboot.rest;

import org.springframework.web.bind.annotation.*;
import training.spring.innova.springboot.rest.models.Person;

@RestController
@RequestMapping("/greet")
public class GreetController {

    @GetMapping("/greet1/{isim}/{soy}")
    public String greet1(@PathVariable("isim") String name,
                         @PathVariable("soy") String surname) {
        return "Greetings " + name + " " + surname;
    }

    @GetMapping("/greet2")
    public String greet2(@RequestParam("isim") String name,
                         @RequestParam("soy") String surname) {
        return "Greetings 2 " + name + " " + surname;
    }

    @GetMapping("/greet3/{isim}")
    public String greet3(@PathVariable("isim") String name,
                         @RequestParam("soy") String surname) {
        return "Greetings 3 " + name + " " + surname;
    }

    @GetMapping("/greet4/{isim}")
    public String greet4(@PathVariable("isim") String name,
                         @MatrixVariable("soy") String surname) {
        return "Greetings 4 " + name + " " + surname;
    }

    @PostMapping("/person1")
    public String greetPerson(@RequestBody Person personParam) {
        return "Greetings person "
               + personParam.getName()
               + " "
               + personParam.getSurname()
               + " "
               + personParam.getBirthDate();
    }

    @PostMapping("/person2")
    public Person greetPerson2(@RequestBody Person personParam) {
        personParam.setName("unknown");
        return personParam;
    }
}
