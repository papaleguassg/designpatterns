package br.com.psg.designpatterns.proxy.person;

public class Person {

    private String name;

    private Role role;


    public Person(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public Role getRole() {
        return role;
    }

    @Override
    public String toString() {
        return name + " (" + role + ")";
    }
}
