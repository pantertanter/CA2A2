/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import rest.entities.SignUp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tha
 */
public class SignUpDTO {
    private long id;
    private String userName;
    private String userPass;

    public SignUpDTO(String userName, String userPass) {
        this.userName = userName;
        this.userPass = userPass;
    }

    public static List<SignUpDTO> getDtos(List<SignUp> rms){
        List<SignUpDTO> rmdtos = new ArrayList();
        rms.forEach(rm->rmdtos.add(new SignUpDTO(rm)));
        return rmdtos;
    }


    public SignUpDTO(SignUp rm) {
        if(rm.getId() != null)
            this.id = rm.getId();
        this.userName = rm.getUserName();
        this.userPass = rm.getUserPass();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    @Override
    public String toString() {
        return "SignUpDTO{" + "id=" + id +
                ", userName='" + userName + '\'' +
                ", userPass='" + userPass + '\'' +
                '}';
    }


}
