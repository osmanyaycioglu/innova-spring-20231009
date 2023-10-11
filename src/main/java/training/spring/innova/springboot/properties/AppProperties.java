package training.spring.innova.springboot.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


// clientHost - Camel
// client_host - Snake
// client-host - Kebap

// ClientHost - Pascal

@Component
@ConfigurationProperties(prefix = "my.app")
@Data
public class AppProperties {

    private String                clientHost;
    private Integer               clientPort = 7070;
    private String                clientDescription;
    private OperationProperties   operationProperties;
    private List<String>          defaultStrs;
    private List<Customer>        customers;
    private Map<String, Customer> customerMap;

}
