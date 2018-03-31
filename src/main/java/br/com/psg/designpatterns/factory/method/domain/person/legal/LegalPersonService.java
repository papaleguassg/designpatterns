package br.com.psg.designpatterns.factory.method.domain.person.legal;

import br.com.psg.designpatterns.factory.method.application.PersonDTO;
import br.com.psg.designpatterns.factory.method.domain.person.Person;
import br.com.psg.designpatterns.factory.method.domain.person.PersonService;
import org.springframework.stereotype.Service;

@Service
public class LegalPersonService  {

    private final PersonService personService;

    private final LegalPersonFactory legalPersonFactory;

    public LegalPersonService(PersonService personService, LegalPersonFactory legalPersonFactory) {
        this.personService = personService;
        this.legalPersonFactory = legalPersonFactory;
    }

    public Person create(PersonDTO dto) {
        return personService.create(dto, legalPersonFactory);
    }
}
