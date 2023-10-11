package training.spring.innova.springboot.jpa;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api/v1/person/provision")
@RequiredArgsConstructor
public class PersonRestController {

    private final IPersonDao personDao;

    @PostMapping("/add")
    public String addPerson(@RequestBody Person personParam) {
        personDao.save(personParam);
        return "OK";
    }

    @PostMapping("/update")
    public String updatePerson(@RequestBody Person personParam) {
        personDao.save(personParam);
        return "OK";
    }

    @GetMapping("/get/one")
    public Person getOnePerson(@RequestParam("pid") Long personId) {
        return personDao.findById(personId)
                        .orElse(null);
    }

    @GetMapping("/get/all")
    public List<Person> getAllPersons() {
        return personDao.findAll();
    }

    @GetMapping("/remove/one")
    public String removeOnePerson(@RequestParam("pid") Long personId) {
        personDao.deleteById(personId);
        return "OK";
    }

    @GetMapping("/find/by/surname")
    public List<Person> findBySurname(@RequestParam("s") String surname) {
        return personDao.findBySurname(surname);
    }

    @GetMapping("/find/like/surname")
    public List<Person> findLikeSurname(@RequestParam("s") String surname) {
        return personDao.findBySurnameLike(surname);
    }

}
