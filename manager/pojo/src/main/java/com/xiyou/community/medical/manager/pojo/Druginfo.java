package com.xiyou.community.medical.manager.pojo;

public class Druginfo {
    private String drugNumber;

    private String drugName;

    private String dosageDescription;

    private String tabooDescription;

    private Long drugPrice;

    public String getDrugNumber() {
        return drugNumber;
    }

    public void setDrugNumber(String drugNumber) {
        this.drugNumber = drugNumber == null ? null : drugNumber.trim();
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName == null ? null : drugName.trim();
    }

    public String getDosageDescription() {
        return dosageDescription;
    }

    public void setDosageDescription(String dosageDescription) {
        this.dosageDescription = dosageDescription == null ? null : dosageDescription.trim();
    }

    public String getTabooDescription() {
        return tabooDescription;
    }

    public void setTabooDescription(String tabooDescription) {
        this.tabooDescription = tabooDescription == null ? null : tabooDescription.trim();
    }

    public Long getDrugPrice() {
        return drugPrice;
    }

    public void setDrugPrice(Long drugPrice) {
        this.drugPrice = drugPrice;
    }
}