package br.com.psg.designpatterns.factory.simple.domain.person;

import org.springframework.stereotype.Repository;

@Repository
public class PersonRepository {

    Person save(Person person) {
        return person;
    }

}
