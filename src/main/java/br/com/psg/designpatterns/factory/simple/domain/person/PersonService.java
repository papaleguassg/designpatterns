package br.com.psg.designpatterns.factory.simple.domain.person;

import br.com.psg.designpatterns.factory.simple.application.PersonDTO;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    private final PersonFactory personFactory;

    protected PersonService(PersonRepository personRepository, PersonFactory personFactory) {
        this.personRepository = personRepository;
        this.personFactory = personFactory;
    }

    public Person create(PersonDTO dto, PersonType personType) {
        Person person = personFactory.create(dto, personType);
        return personRepository.save(person);
    }
}
