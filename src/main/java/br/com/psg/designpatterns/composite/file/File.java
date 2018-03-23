package br.com.psg.designpatterns.composite.file;

public abstract class File {

    protected String name;

    protected File(String name) {
        this.name = name;
    }

    File add(File file) {
        throw new UnsupportedOperationException("This file type does not support the operation add");
    }

    void remove(File file) {
        throw new UnsupportedOperationException("This file type does not support the operation remove");
    }

    File search(String name) {
        throw new UnsupportedOperationException("This file type does not support the operation search");
    }

    void printFile() {
        System.out.println("  --> " + this.name);
    }
}
