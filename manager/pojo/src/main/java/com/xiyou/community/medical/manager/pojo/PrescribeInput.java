package com.xiyou.community.medical.manager.pojo;

public class PrescribeInput {
    private Integer userId;

    private String patienName;

    private Boolean isInfusion;

    private String diagnosisDisease;

    private String drugName;

    private String drugNumber;

    private Long totalCost;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPatienName() {
        return patienName;
    }

    public void setPatienName(String patienName) {
        this.patienName = patienName == null ? null : patienName.trim();
    }

    public Boolean getIsInfusion() {
        return isInfusion;
    }

    public void setIsInfusion(Boolean isInfusion) {
        this.isInfusion = isInfusion;
    }

    public String getDiagnosisDisease() {
        return diagnosisDisease;
    }

    public void setDiagnosisDisease(String diagnosisDisease) {
        this.diagnosisDisease = diagnosisDisease == null ? null : diagnosisDisease.trim();
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName == null ? null : drugName.trim();
    }

    public String getDrugNumber() {
        return drugNumber;
    }

    public void setDrugNumber(String drugNumber) {
        this.drugNumber = drugNumber == null ? null : drugNumber.trim();
    }

    public Long getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Long totalCost) {
        this.totalCost = totalCost;
    }
}