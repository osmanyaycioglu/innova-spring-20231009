package training.spring.innova.springboot.hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
@Profile("live")
public class HelloConfiguration {

    @Bean
    public IHello hello(@Value("${hello.language}") String language) {
        switch (language) {
            case "tr":
                return new TurkishHello();
            case "esp":
                return new SpanishHello();
            case "eng":
            default:
                return new EnglishHello();
        }
    }

    //@Scheduled(fixedDelay = 10_000, initialDelay = 1_000)
    //@Scheduled(fixedDelayString = "${hello.schedule.period}", initialDelay = 1_000)
    @Scheduled(cron = "${hello.schedule.cron}")
    public void doSomething() {
        System.out.println("Scheduling çalıştı");
    }
}
