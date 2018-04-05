package br.com.psg.designpatterns.proxy.dispute;

import br.com.psg.designpatterns.proxy.person.Person;
import br.com.psg.designpatterns.proxy.person.Role;

import java.util.List;

public class DisputeFileProxy extends DisputeFile {

    private final Person person;

    public DisputeFileProxy(List<File> files, Person person) {
        super(files);
        this.person = person;
    }

    @Override
    public List<File> getFiles() {
        if (Role.hasPermission().contains(person.getRole())) {
            return super.getFiles();
        }
        return null;
    }
}
