package training.spring.innova.springboot.jpa;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "kisi")
public class Person {
    @Id
    @GeneratedValue
    private Long          personId;
    private String        name;
    @Column(name = "last_name")
    private String        surname;
    private Integer       age;
    private String        address;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private PersonDetails personDetails;
}
