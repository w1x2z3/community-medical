package com.xiyou.community.medical.manager.pojo;

public class Lifestyle {
    private Integer userId;

    private String drinkCondition;

    private String smokingCondition;

    private String bloodPressureCondition;

    private String exerciseCondition;

    private String mealsCondition;

    private String sleepCondition;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getDrinkCondition() {
        return drinkCondition;
    }

    public void setDrinkCondition(String drinkCondition) {
        this.drinkCondition = drinkCondition == null ? null : drinkCondition.trim();
    }

    public String getSmokingCondition() {
        return smokingCondition;
    }

    public void setSmokingCondition(String smokingCondition) {
        this.smokingCondition = smokingCondition == null ? null : smokingCondition.trim();
    }

    public String getBloodPressureCondition() {
        return bloodPressureCondition;
    }

    public void setBloodPressureCondition(String bloodPressureCondition) {
        this.bloodPressureCondition = bloodPressureCondition == null ? null : bloodPressureCondition.trim();
    }

    public String getExerciseCondition() {
        return exerciseCondition;
    }

    public void setExerciseCondition(String exerciseCondition) {
        this.exerciseCondition = exerciseCondition == null ? null : exerciseCondition.trim();
    }

    public String getMealsCondition() {
        return mealsCondition;
    }

    public void setMealsCondition(String mealsCondition) {
        this.mealsCondition = mealsCondition == null ? null : mealsCondition.trim();
    }

    public String getSleepCondition() {
        return sleepCondition;
    }

    public void setSleepCondition(String sleepCondition) {
        this.sleepCondition = sleepCondition == null ? null : sleepCondition.trim();
    }
}