package br.com.psg.designpatterns.factory.simple.application;

import br.com.psg.designpatterns.factory.simple.domain.person.PersonService;
import br.com.psg.designpatterns.factory.simple.domain.person.PersonType;

public class PhysicalPersonController {

    private final PersonService service;

    public PhysicalPersonController(PersonService service) {
        this.service = service;
    }

    public void post(PersonDTO dto) {
        service.create(dto, PersonType.PHYSICAL);
    }
}
