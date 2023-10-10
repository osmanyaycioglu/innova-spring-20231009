package training.spring.innova.springboot.hello;

import org.springframework.stereotype.Component;

public class EnglishHello implements IHello{
    @Override
    public String sayHello(final String name,
                           final String surname) {
        return "Hello " + name + " " + surname;
    }

    @Override
    public String sayGoodbye(final String name,
                             final String surname) {
        return "Goodbye " + name + " " + surname;
    }
}
