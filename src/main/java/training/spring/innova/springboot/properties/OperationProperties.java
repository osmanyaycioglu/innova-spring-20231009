package training.spring.innova.springboot.properties;

import lombok.Data;

@Data
public class OperationProperties {
    private String ftpDesc;
    private String ftpHost;
    private String ftpPort;
    private EFTPType ftpType;
}
