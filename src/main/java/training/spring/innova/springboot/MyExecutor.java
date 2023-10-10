package training.spring.innova.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("executor")
public class MyExecutor implements ApplicationRunner {

    private SpringBootTrainingApplication application;
    @Autowired
    private MyScopeTestBean myScopeTestBean1;
    @Autowired
    private MyScopeTestBean myScopeTestBean2;
    @Autowired
    private MyScopeTestBean myScopeTestBean3;
    @Autowired
    private MyScopeTestBean myScopeTestBean4;

    public MyExecutor(SpringBootTrainingApplication application) {
        this.application = application;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        application.callAllBeans();
        myScopeTestBean1.testMe();
        myScopeTestBean2.testMe();
        myScopeTestBean3.testMe();
        myScopeTestBean4.testMe();
        // throw new IllegalStateException("test");
    }
}
