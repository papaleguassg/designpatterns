package br.com.psg.designpatterns.factory.method.domain.person;

import br.com.psg.designpatterns.factory.method.application.PersonDTO;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    protected PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person create(PersonDTO dto, PersonFactory personFactory) {
        Person person = personFactory.create(dto);
        return personRepository.save(person);
    }
}
