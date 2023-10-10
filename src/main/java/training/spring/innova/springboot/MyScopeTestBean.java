package training.spring.innova.springboot;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Scope("prototype")
public class MyScopeTestBean {
    private int counter = 0;
    private String uId;

    public MyScopeTestBean() {
        uId = UUID.randomUUID().toString();
        System.out.println("MyScopeTestBean yaratıldı : " + uId);

    }

    public void testMe(){
        counter++;
        System.out.println(uId +" Counter : " + counter);
    }


}
