package br.com.psg.designpatterns.proxy.dispute;

import br.com.psg.designpatterns.proxy.person.Person;

import java.util.List;

public class Dispute {

    private List<Person> people;

    private DisputeFile files;

    public Dispute(List<Person> people, DisputeFile files) {
        this.people = people;
        this.files = files;
    }

    public List<Person> getPeople() {
        return people;
    }

    public DisputeFileProxy getFiles(Person person) {
        return new DisputeFileProxy(files.getFiles(), person);
    }
}
