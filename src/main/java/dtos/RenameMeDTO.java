/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import rest.entities.RenameMe;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tha
 */
public class RenameMeDTO {
    private long id;
    private String userName;
    private String userPass;

    public RenameMeDTO(String userName, String userPass) {
        this.userName = userName;
        this.userPass = userPass;
    }

    public static List<RenameMeDTO> getDtos(List<RenameMe> rms){
        List<RenameMeDTO> rmdtos = new ArrayList();
        rms.forEach(rm->rmdtos.add(new RenameMeDTO(rm)));
        return rmdtos;
    }


    public RenameMeDTO(RenameMe rm) {
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
        return "RenameMeDTO{" + "id=" + id +
                ", userName='" + userName + '\'' +
                ", userPass='" + userPass + '\'' +
                '}';
    }


}
