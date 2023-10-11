package training.spring.innova.springboot.jpa;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class PersonDetails {
    @Id
    @GeneratedValue
    private Long pdId;
    private String nickName;
    private Integer weight;
    private Integer height;

}
