package training.spring.innova.springboot.rest;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import training.spring.innova.springboot.rest.models.Person;
import training.test.anotherpackage.GreetingsService;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/greetings")
@RequiredArgsConstructor
public class GreetingsAPIController {

    private final GreetingsService greetingsService;

    @GetMapping("/with/name")
    public String greetName(@RequestParam("name") String name) {
        return greetingsService.greet(name);
    }

    @GetMapping("/with/name/and/surname")
    public String greetNameAndSurname(@RequestParam("name") String nameParam,
                                      @RequestParam("surname") String surnameParam) {
        return greetingsService.greet(nameParam,
                                      surnameParam);
    }

    @PostMapping("/to/person")
    public String greetPerson(@Valid @RequestBody Person personParam) {
        return greetingsService.greet(personParam);
    }

}
