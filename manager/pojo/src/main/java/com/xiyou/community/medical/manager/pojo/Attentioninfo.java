package com.xiyou.community.medical.manager.pojo;

public class Attentioninfo {
    private Integer userId;

    private String theAllergy;

    private String diseaseHistory;

    private String presentSituation;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTheAllergy() {
        return theAllergy;
    }

    public void setTheAllergy(String theAllergy) {
        this.theAllergy = theAllergy == null ? null : theAllergy.trim();
    }

    public String getDiseaseHistory() {
        return diseaseHistory;
    }

    public void setDiseaseHistory(String diseaseHistory) {
        this.diseaseHistory = diseaseHistory == null ? null : diseaseHistory.trim();
    }

    public String getPresentSituation() {
        return presentSituation;
    }

    public void setPresentSituation(String presentSituation) {
        this.presentSituation = presentSituation == null ? null : presentSituation.trim();
    }
}