package br.com.psg.designpatterns.proxy.person;

import java.util.Arrays;
import java.util.List;

public enum  Role {

    MANAGER, OPERATOR, LAWYER, APPLICANT, REQUESTED;

    public static List<Role> hasPermission(){
        return Arrays.asList(MANAGER, OPERATOR, LAWYER, APPLICANT);
    }


}
