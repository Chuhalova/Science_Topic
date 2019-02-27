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
public class ScientistScienceTopic {
    private String id;
    private String nameWork;
    private String startDate;
    private String finishDate;
    private String surname;
    public ScientistScienceTopic(String id, String nameWork, String startDate, String finishDate, String surname) { 
        this.id = id;
        this.nameWork = nameWork;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.surname = surname;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getNameWork() {
        return nameWork;
    }

    public void setNameWork(String nameWork) {
        this.nameWork = nameWork;
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

    public String getScientistSurname() {
        return surname;
    }

    public void setScientistSurname(String surname) {
        this.surname = surname;
    }
}
