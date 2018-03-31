package br.com.psg.designpatterns.factory.method.domain.person.legal;

import br.com.psg.designpatterns.factory.method.domain.person.Person;
import br.com.psg.designpatterns.factory.method.application.PersonDTO;
import br.com.psg.designpatterns.factory.method.domain.person.PersonFactory;
import org.springframework.stereotype.Service;

@Service
public class LegalPersonFactory implements PersonFactory {

    @Override
    public Person create(PersonDTO dto) {
        return new LegalPerson();
    }
}
