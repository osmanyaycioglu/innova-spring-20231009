package training.spring.innova.springboot.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public interface IPersonDao extends JpaRepository<Person, Long> {

    List<Person> findBySurname(String surname);

    List<Person> findBySurnameLike(String surname);

    List<Person> findBySurnameAndNameOrderByPersonId(String surname,
                                                     String name);

    List<Person> findByNameIn(List<String> names);

    @Query("select p from Person p where p.surname=?1")
    List<Person> getPersonViaSurname(String surname);

    @Query("select p from Person p where p.surname=:isim")
    List<Person> getPersonViaSurname2(@Param("isim") String surname);

    @Query(value = "select * from kisi p where p.last_name=?1",nativeQuery = true)
    List<Person> getPersonViaSurnameNative(String surname);

}
