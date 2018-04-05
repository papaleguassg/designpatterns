package br.com.psg.designpatterns.proxy.app;

import br.com.psg.designpatterns.proxy.dispute.Dispute;
import br.com.psg.designpatterns.proxy.dispute.DisputeFile;
import br.com.psg.designpatterns.proxy.dispute.File;
import br.com.psg.designpatterns.proxy.person.Person;
import br.com.psg.designpatterns.proxy.person.Role;

import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Person maikoCunha = new Person("Maiko Cunha", Role.MANAGER);
        Person rafaelRasso = new Person("Rafael Rasso", Role.LAWYER);
        Person larissaRoder = new Person("Larissa Roder", Role.APPLICANT);
        Person leandroUlisses = new Person("Leandro Ulisses", Role.REQUESTED);

        List<Person> people = Arrays.asList(maikoCunha, rafaelRasso, larissaRoder, leandroUlisses);

        File file1 = new File("File 1");
        File file2 = new File("File 2");
        File file3 = new File("File 3");

        List<File> files = Arrays.asList(file1, file2, file3);

        DisputeFile disputeFile = new DisputeFile(files);


        Dispute dispute = new Dispute(people, disputeFile);

        System.out.println();
        System.out.println(maikoCunha + " - " + dispute.getFiles(maikoCunha).getFiles());
        System.out.println(rafaelRasso + " - " +  dispute.getFiles(rafaelRasso).getFiles());
        System.out.println(larissaRoder + " - " +  dispute.getFiles(larissaRoder).getFiles());
        System.out.println(leandroUlisses + " - " + dispute.getFiles(leandroUlisses).getFiles());

    }

}
