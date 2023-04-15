package com.easyimmo.mailsender.presentation.mail.dto;

public class CreateAutoEmailRequestDto {
    private String fromAdress;
    private Integer emailTemplateId;
    private String emailAdress;
    private Integer userId;

    public String getFromAdress() {
        return fromAdress;
    }

    public Integer getEmailTemplateId() {
        return emailTemplateId;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setFromAdress(String fromAdress) {
        this.fromAdress = fromAdress;
    }

    public void setEmailTemplateId(Integer emailTemplateId) {
        this.emailTemplateId = emailTemplateId;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
