package com.xiyou.community.medical.manager.pojo;

import java.util.Date;

public class PreviousTreat {
    private Integer userId;

    private String theDisease;

    private Date diagnosisTime;

    private String threatAddress;

    private Boolean isCure;

    private String presentSituation;

    private String responsibleDoctor;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTheDisease() {
        return theDisease;
    }

    public void setTheDisease(String theDisease) {
        this.theDisease = theDisease == null ? null : theDisease.trim();
    }

    public Date getDiagnosisTime() {
        return diagnosisTime;
    }

    public void setDiagnosisTime(Date diagnosisTime) {
        this.diagnosisTime = diagnosisTime;
    }

    public String getThreatAddress() {
        return threatAddress;
    }

    public void setThreatAddress(String threatAddress) {
        this.threatAddress = threatAddress == null ? null : threatAddress.trim();
    }

    public Boolean getIsCure() {
        return isCure;
    }

    public void setIsCure(Boolean isCure) {
        this.isCure = isCure;
    }

    public String getPresentSituation() {
        return presentSituation;
    }

    public void setPresentSituation(String presentSituation) {
        this.presentSituation = presentSituation == null ? null : presentSituation.trim();
    }

    public String getResponsibleDoctor() {
        return responsibleDoctor;
    }

    public void setResponsibleDoctor(String responsibleDoctor) {
        this.responsibleDoctor = responsibleDoctor == null ? null : responsibleDoctor.trim();
    }
}