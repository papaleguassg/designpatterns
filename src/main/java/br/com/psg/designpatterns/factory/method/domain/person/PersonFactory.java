package br.com.psg.designpatterns.factory.method.domain.person;

import br.com.psg.designpatterns.factory.method.application.PersonDTO;

public interface PersonFactory {

    Person create(PersonDTO dto);
}
