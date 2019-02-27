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
public class ProfessorScienceTopic {
    private String id;
    private String startDate;
    private String finishDate;
    private String surname;
    private String st;
    public ProfessorScienceTopic(String id, String startDate, String finishDate, String surname, String st){ 
        this.id = id;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.surname = surname;
        this.st = st;
    }
    public String getId() {
        return id;
    }
    public String getst(){
        return st;
    }
    
    public void setst(String st){
        this.st = st;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return finishDate;
    }

    public void setEndDate(String finishDate) {
        this.finishDate = finishDate;
    }

    public String getProfSurname() {
        return surname;
    }

    public void setProfSurname(String surname) {
        this.surname = surname;
    }
}
