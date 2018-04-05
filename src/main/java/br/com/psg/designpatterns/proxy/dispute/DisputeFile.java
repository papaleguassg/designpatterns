package br.com.psg.designpatterns.proxy.dispute;


import java.util.List;

public class DisputeFile {

    private List<File> files;

    public DisputeFile(List<File> files) {
        this.files = files;
    }

    public List<File> getFiles() {
        return files;
    }

    @Override
    public String toString() {
        return files.toString();
    }
}
