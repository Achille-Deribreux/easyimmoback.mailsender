package com.easyimmo.mailsender.infra.mail.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.easyimmo.mailsender.infra.contact.ContactEntity;
import com.easyimmo.mailsender.infra.emailtemplate.EmailTemplateEntity;

@Entity
@Table(name = "autoemail", schema = "MAILSENDER")
public class AutoEmailEntity {

    @Id
    @Column(name= "id")
    private Integer id;

    @Column(name="fromAdress")
    private String fromAdress;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="emailTemplate_id", referencedColumnName = "id")
    private EmailTemplateEntity emailTemplateEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="contact_id", referencedColumnName = "id")
    private ContactEntity contactEntity;

    @Column(name = "userId")
    private Integer userId;

    public AutoEmailEntity() {
    }

    public AutoEmailEntity(Integer id, String fromAdress, EmailTemplateEntity emailTemplateEntity, ContactEntity contactEntity, Integer userId) {
        this.id = id;
        this.fromAdress = fromAdress;
        this.emailTemplateEntity = emailTemplateEntity;
        this.contactEntity = contactEntity;
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

    public ContactEntity getContact() {
        return contactEntity;
    }

    public void setContact(ContactEntity contactEntity) {
        this.contactEntity = contactEntity;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
