package br.com.psg.designpatterns.factory.simple.domain.person.physical;

import br.com.psg.designpatterns.factory.simple.application.PersonDTO;
import br.com.psg.designpatterns.factory.simple.domain.person.PersonFactory;
import br.com.psg.designpatterns.factory.simple.domain.person.Person;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class PhysicalPersonFactory {

    public Person create(PersonDTO dto) {
        return new PhysicalPerson();
    }

}
