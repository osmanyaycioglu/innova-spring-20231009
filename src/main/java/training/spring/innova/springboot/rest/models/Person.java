package training.spring.innova.springboot.rest.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
public class Person {
    @NotNull
    @NotEmpty
    @NotBlank
    @Size(min = 2, max = 20)
    private String    name;
    @NotNull
    @NotEmpty
    @Size(min = 3, max = 25)
    private String    surname;
    @Positive
    @Min(10)
    @Max(200)
    private Integer   age;
    @Past
    private LocalDate birthDate;
    @NotNull
    @NotEmpty
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$", message = "en az bir harf ve en az bir rakam olmalı")
    private String    password;

}
