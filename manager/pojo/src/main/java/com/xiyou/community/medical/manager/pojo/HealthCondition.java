package com.xiyou.community.medical.manager.pojo;

public class HealthCondition {
    private Integer userId;

    private String physicalCondition;

    private Integer bloodPressure;

    private String heartRate;

    private Boolean isCardvascular;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPhysicalCondition() {
        return physicalCondition;
    }

    public void setPhysicalCondition(String physicalCondition) {
        this.physicalCondition = physicalCondition == null ? null : physicalCondition.trim();
    }

    public Integer getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(Integer bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public String getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(String heartRate) {
        this.heartRate = heartRate == null ? null : heartRate.trim();
    }

    public Boolean getIsCardvascular() {
        return isCardvascular;
    }

    public void setIsCardvascular(Boolean isCardvascular) {
        this.isCardvascular = isCardvascular;
    }
}