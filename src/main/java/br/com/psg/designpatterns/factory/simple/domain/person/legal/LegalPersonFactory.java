package br.com.psg.designpatterns.factory.simple.domain.person.legal;

import br.com.psg.designpatterns.factory.simple.application.PersonDTO;
import br.com.psg.designpatterns.factory.simple.domain.person.PersonFactory;
import br.com.psg.designpatterns.factory.simple.domain.person.Person;
import org.springframework.stereotype.Service;

@Service
public class LegalPersonFactory {

    public Person create(PersonDTO dto) {
        return new LegalPerson();
    }
}
