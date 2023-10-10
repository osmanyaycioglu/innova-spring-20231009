package training.spring.innova.springboot.hello;

import org.springframework.stereotype.Component;

public class TurkishHello implements IHello {
    @Override
    public String sayHello(final String name,
                           final String surname) {
        return "Selam " + name + " " + surname;
    }

    @Override
    public String sayGoodbye(final String name,
                             final String surname) {
        return "Güle güle " + name + " " + surname;
    }
}
