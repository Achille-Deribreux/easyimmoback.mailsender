package com.easyimmo.mailsender.autoemail.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.easyimmo.mailsender.contact.model.Contact;
import com.easyimmo.mailsender.emailtemplate.model.EmailTemplate;

@Entity
public class AutoEmail {

    @Id
    @Column(name= "id")
    private Integer id;

    @Column(name="fromAdress")
    private String fromAdress;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="emailTemplate_id", referencedColumnName = "id")
    private EmailTemplate emailTemplate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="contact_id", referencedColumnName = "id")
    private Contact contact;

    @Column(name = "property_id")
    private Integer propertyId;

    @Column(name = "userId")
    private Integer userId;


    public AutoEmail(Integer id, String fromAdress, EmailTemplate emailTemplate, Contact contact, Integer propertyId,Integer userId) {
        this.id = id;
        this.fromAdress = fromAdress;
        this.emailTemplate = emailTemplate;
        this.contact = contact;
        this.propertyId = propertyId;
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

    public EmailTemplate getEmailTemplate() {
        return emailTemplate;
    }

    public void setEmailTemplate(EmailTemplate emailTemplate) {
        this.emailTemplate = emailTemplate;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Integer getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
