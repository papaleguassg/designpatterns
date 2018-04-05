package br.com.psg.designpatterns.proxy.dispute;

public class File {

    private final String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
