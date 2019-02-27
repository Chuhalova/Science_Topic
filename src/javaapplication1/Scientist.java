
package javaapplication1;


public class Scientist {
    private String idScientist;
    private String surname;
    private String tel;
    private String sex;
    private String topicMas;
    private String startDateMas;
    private String finishDateMas;
    private String finishingReasonMas;
    private String topicAsp;
    private String startDateAsp;
    private String finishDateAsp;
    private String presentDateAsp;
    private String positionProf;
    private String rankProf;
    private String startWorkProf;
    private String roleScientist;
    private String idDep;
    public Scientist(String idScientist, String surname, String tel, String sex, String topicMas, String startDateMas, String finishDateMas, String finishingReasonMas, String topicAsp, String startDateAsp, String finishDateAsp, String presentDateAsp, String positionProf, String rankProf,String startWorkProf, String roleScientist, String idDep)
    {
        this.idScientist = idScientist;
        this.surname = surname;
        this.tel = tel;
        this.sex = sex;
        this.topicMas = topicMas;
        this.startDateMas = startDateMas;
        this.finishDateMas = finishDateMas;
        this.finishingReasonMas = finishingReasonMas;
        this.topicAsp = topicAsp;
        this.startDateAsp = startDateAsp;
        this.finishDateAsp = finishDateAsp;
        this.presentDateAsp = presentDateAsp;
        this.positionProf = positionProf;
        this.rankProf = rankProf;
        this.startWorkProf = startWorkProf;
        this.roleScientist = roleScientist;
        this.idDep = idDep;
    }
    public String getScientistId() {
        return idScientist;
    }

    public void setScientistId(String idScientist) {
        this.idScientist = idScientist;
    }

    public String getSecondName() {
        return surname;
    }

    public void setSecondName(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return tel;
    }

    public void setPhoneNumber(String tel) {
        this.tel = tel;
    }

    public String getGender() {
        return sex;
    }

    public void setGender(String sex) {
        this.sex = sex;
    }

    public String getTopicMas() {
        return topicMas;
    }

    public void setTopicMas(String topicMas) {
        this.topicMas = topicMas;
    }

    public String getStartDateMas() {
        return startDateMas;
    }

    public void setStartDateMas(String startDateMas) {
        this.startDateMas = startDateMas;
    }

    public String getEndDateMas() {
        return finishDateMas;
    }

    public void setEndDateMas(String finishDateMas) {
        this.finishDateMas = finishDateMas;
    }

    public String getFinishingReasonMas() {
        return finishingReasonMas;
    }

    public void setFinishingReasonMas(String finishingReasonMas) {
        this.finishingReasonMas = finishingReasonMas;
    }

    public String getTopicAsp() {
        return topicAsp;
    }

    public void setTopicAsp(String topicAsp) {
        this.topicAsp = topicAsp;
    }

    public String getStartDateAsp() {
        return startDateAsp;
    }

    public void setStartDateAsp(String startDateAsp) {
        this.startDateAsp = startDateAsp;
    }

    public String getEndDateAsp() {
        return finishDateAsp;
    }

    public void setEndDateAsp(String finishDateAsp) {
        this.finishDateAsp = finishDateAsp;
    }

    public String getPresentDateAsp() {
        return presentDateAsp;
    }

    public void setPresentDateAsp(String presentDateAsp) {
        this.presentDateAsp = presentDateAsp;
    }

    public String getPositionProf() {
        return positionProf;
    }

    public void setPositionProf(String positionProf) {
        this.positionProf = positionProf;
    }

    public String getRankProf() {
        return rankProf;
    }

    public void setRankProf(String rankProf) {
        this.rankProf = rankProf;
    }

    public String getStartWorkProf() {
        return startWorkProf;
    }

    public void setStartWorkProf(String startWorkProf) {
        this.startWorkProf = startWorkProf;
    }
    public String getRoleScientist(){
        return roleScientist;
    }

    public void setRoleScientist(String roleScientist) {
        this.roleScientist = roleScientist;
    }

    public String getCathedraId() {
        return idDep;
    }

    public void setCathedraId(String idDep) {
        this.idDep = idDep;
    }
    @Override
    public String toString() {
        return this.getScientistId() + " " + this.getSecondName();
    }
}

    