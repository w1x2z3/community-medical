package com.xiyou.community.medical.manager.pojo;

public class Monitorinfo {
    private Integer userId;

    private Boolean mailRemind;

    private Boolean phoneRemind;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Boolean getMailRemind() {
        return mailRemind;
    }

    public void setMailRemind(Boolean mailRemind) {
        this.mailRemind = mailRemind;
    }

    public Boolean getPhoneRemind() {
        return phoneRemind;
    }

    public void setPhoneRemind(Boolean phoneRemind) {
        this.phoneRemind = phoneRemind;
    }
}