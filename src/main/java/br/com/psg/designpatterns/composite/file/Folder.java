package br.com.psg.designpatterns.composite.file;

import java.util.ArrayList;
import java.util.List;

public class Folder extends File {

    List<File> files = new ArrayList<>();

    protected Folder(String name) {
        super(name);
    }

    @Override
    public File add(File file) {
        this.files.add(file);
        return this;
    }

    @Override
    public void remove(File file) {
        this.remove(file);
    }

    @Override
    public File search(String name) {
        return this.files.stream().filter(file -> file.name.equals(name)).findFirst().orElseThrow(IllegalArgumentException::new);
    }

    @Override
    public void printFile() {
        System.out.println(" - " + name);
        files.stream().forEach(File::printFile);
    }
}
