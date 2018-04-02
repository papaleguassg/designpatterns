package br.com.psg.designpatterns.factory.simple.domain.person;

import br.com.psg.designpatterns.factory.simple.application.PersonDTO;
import br.com.psg.designpatterns.factory.simple.domain.person.legal.LegalPersonFactory;
import br.com.psg.designpatterns.factory.simple.domain.person.physical.PhysicalPersonFactory;
import org.springframework.stereotype.Component;

@Component
public class PersonFactory {

    private final PhysicalPersonFactory physicalPersonFactory;

    private final LegalPersonFactory legalPersonFactory;

    public PersonFactory(PhysicalPersonFactory physicalPersonFactory, LegalPersonFactory legalPersonFactory) {
        this.physicalPersonFactory = physicalPersonFactory;
        this.legalPersonFactory = legalPersonFactory;
    }

    public Person create(PersonDTO dto, PersonType type) {
        switch (type) {
            case LEGAL:
                return legalPersonFactory.create(dto);
            case PHYSICAL:
                return physicalPersonFactory.create(dto);
            default:
                throw new IllegalArgumentException("Type person not implemented");
        }
    }
}
