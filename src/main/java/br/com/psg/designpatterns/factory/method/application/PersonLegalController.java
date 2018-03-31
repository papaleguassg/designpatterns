package br.com.psg.designpatterns.factory.method.application;

import br.com.psg.designpatterns.factory.method.domain.person.legal.LegalPersonService;

public class PersonLegalController {

    private final LegalPersonService service;

    public PersonLegalController(LegalPersonService service) {
        this.service = service;
    }

    public void post(PersonDTO dto) {
        service.create(dto);
    }
}
