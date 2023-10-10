package training.spring.innova.springboot.hello;

public class SpanishHello implements IHello {
    @Override
    public String sayHello(final String name,
                           final String surname) {
        return "Ola " + name + " " + surname;
    }

    @Override
    public String sayGoodbye(final String name,
                             final String surname) {
        return "Adios " + name + " " + surname;
    }
}
