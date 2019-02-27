/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author veronikachuhalova
 */
public class Department {
    private String idDep;
    private String nameDep;
    private String telDep;

    public Department(String idDep, String nameDep, String telDep) {
        this.idDep = idDep;
        this.nameDep = nameDep;
        this.telDep = telDep;
    }

    public String getId() {
        return idDep;
    }

    public void setId(String idDep) {
        this.idDep = idDep;
    }

    public String getName() {
        return nameDep;
    }

    public void setName(String nameDep) {
        this.nameDep = nameDep;
    }

    public String getPhoneNumber() {
        return telDep;
    }

    public void setPhoneNumber(String telDep) {
        this.telDep = telDep;
    }
    
    @Override
    public String toString() {
        return this.getId() + " " + this.getName();
    }
}
