package br.com.psg.designpatterns.composite.file;

public class Client {

    public static void main(String[] args) {
        Folder documents = new Folder("Documents");
        Folder projects = new Folder("Projects");
        Folder java = new Folder("Java");
        TxtFile readmeJavaProject1 = new TxtFile("JAVA_PROJECT_1_README.md");
        TxtFile readmeJavaProject2 = new TxtFile("JAVA_PROJECT_2_README.md");
        TxtFile readmeJavaProject3 = new TxtFile("JAVA_PROJECT_3_README.md");
        TxtFile readmeJavaProject4 = new TxtFile("JAVA_PROJECT_4_README.md");
        TxtFile readmeJavaProject5 = new TxtFile("JAVA_PROJECT_5_README.md");
        TxtFile readmeJavaProject6 = new TxtFile("JAVA_PROJECT_6_README.md");


        documents.add(projects);
        projects.add(java);
        java.add(readmeJavaProject1)
                .add(readmeJavaProject2)
                .add(readmeJavaProject3)
                .add(readmeJavaProject4)
                .add(readmeJavaProject5)
                .add(readmeJavaProject6);

        documents.printFile();
        projects.printFile();
        java.printFile();
    }
}
