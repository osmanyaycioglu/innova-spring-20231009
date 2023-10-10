package training.spring.innova.springboot.subpackage;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class UnExpectedBean {


    public UnExpectedBean() {
        System.out.println("UnExpectedBean yaratıldı");
    }
}
