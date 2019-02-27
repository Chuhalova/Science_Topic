package javaapplication1;

public class ScienceTopic {
    private String idST;
    private String idDep;
    private String nameST;
    private String nameCust;
    private String startDate;
    private String finishDate;
    
    public ScienceTopic(String idST, String idDep, String nameST, String nameCust, String startDate, String finishDate) { 
        this.idST = idST;
        this.idDep = idDep;
        this.nameST = nameST;
        this.nameCust = nameCust;
        this.startDate = startDate;
        this.finishDate = finishDate;
    }

    public String getId(){
        return idST;
    }

    public void setId(String idST) {
        this.idST = idST;
    }

    public String getCathedraId() {
        return idDep;
    }

    public void setCathedraId(String idDep) {
        this.idDep = idDep;
    }

    public String getName() {
        return nameST;
    }

    public void setName(String nameST) {
        this.nameST = nameST;
    }

    public String getCustomer() {
        return nameCust;
    }

    public void setCustomer(String nameCust) {
        this.nameCust = nameCust;
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

    @Override
    public String toString() {
        return this.getId() + " " + this.getName();
    }
}