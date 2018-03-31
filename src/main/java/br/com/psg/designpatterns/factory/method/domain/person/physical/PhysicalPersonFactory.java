package br.com.psg.designpatterns.factory.method.domain.person.physical;

import br.com.psg.designpatterns.factory.method.application.PersonDTO;
import br.com.psg.designpatterns.factory.method.domain.person.Person;
import br.com.psg.designpatterns.factory.method.domain.person.PersonFactory;
import org.springframework.stereotype.Component;

@Component
public class PhysicalPersonFactory implements PersonFactory {

    @Override
    public Person create(PersonDTO dto) {
        return new PhysicalPerson();
    }
}
