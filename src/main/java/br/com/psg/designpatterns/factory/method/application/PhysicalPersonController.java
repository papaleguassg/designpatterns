package br.com.psg.designpatterns.factory.method.application;

import br.com.psg.designpatterns.factory.method.domain.person.physical.PhysicalPersonService;

public class PhysicalPersonController {

    private final PhysicalPersonService service;

    public PhysicalPersonController(PhysicalPersonService service) {
        this.service = service;
    }

    public void post(PersonDTO dto){
        service.create(dto);
    }
}
