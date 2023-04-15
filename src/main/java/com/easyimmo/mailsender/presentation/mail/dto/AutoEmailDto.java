package com.easyimmo.mailsender.presentation.mail.dto;

import com.easyimmo.mailsender.presentation.contact.dto.CreateContactRequest;
import com.easyimmo.mailsender.infra.emailtemplate.EmailTemplateEntity;

public class AutoEmailDto {

    private Integer id;
    private String fromAdress;
    private EmailTemplateEntity emailTemplateEntity;
    private CreateContactRequest contact;
    private Integer userId;

    public AutoEmailDto(Integer id, String fromAdress, EmailTemplateEntity emailTemplateEntity, CreateContactRequest contact, Integer userId) {
        this.id = id;
        this.fromAdress = fromAdress;
        this.emailTemplateEntity = emailTemplateEntity;
        this.contact = contact;
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFromAdress() {
        return fromAdress;
    }

    public void setFromAdress(String fromAdress) {
        this.fromAdress = fromAdress;
    }

    public EmailTemplateEntity getEmailTemplate() {
        return emailTemplateEntity;
    }

    public void setEmailTemplate(EmailTemplateEntity emailTemplateEntity) {
        this.emailTemplateEntity = emailTemplateEntity;
    }

    public CreateContactRequest getContact() {
        return contact;
    }

    public void setContact(CreateContactRequest contact) {
        this.contact = contact;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
