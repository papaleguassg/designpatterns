package br.com.psg.designpatterns.factory.method.domain.person.physical;

import br.com.psg.designpatterns.factory.method.application.PersonDTO;
import br.com.psg.designpatterns.factory.method.domain.person.Person;
import br.com.psg.designpatterns.factory.method.domain.person.PersonService;
import org.springframework.stereotype.Service;

@Service
public class PhysicalPersonService {

    private final PersonService personService;

    private final PhysicalPersonFactory physicalPersonFactory;

    public PhysicalPersonService(PersonService personService, PhysicalPersonFactory physicalPersonFactory) {
        this.personService = personService;
        this.physicalPersonFactory = physicalPersonFactory;
    }

    public Person create(PersonDTO dto) {
        return personService.create(dto, physicalPersonFactory);
    }
}
