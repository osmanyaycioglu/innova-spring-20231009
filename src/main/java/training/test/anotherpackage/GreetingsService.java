package training.test.anotherpackage;

import org.springframework.stereotype.Service;
import training.spring.innova.springboot.rest.models.Person;

@Service
public class GreetingsService {

    public String greet(String name) {
        return "Greetings " + name;
    }

    public String greet(String name,
                        String surname) {
        return "Greetings " + name + " " + surname;
    }

    public String greet(Person personParam) {
        return "Greetings " + personParam.getName() + " " + personParam.getSurname() + " " + personParam.getBirthDate();
    }


}
