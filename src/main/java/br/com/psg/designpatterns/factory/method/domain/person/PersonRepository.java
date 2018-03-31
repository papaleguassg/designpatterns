package br.com.psg.designpatterns.factory.method.domain.person;

import org.springframework.stereotype.Repository;

@Repository
public class PersonRepository {

    Person save(Person person) {
        return person;
    }

}
