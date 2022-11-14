package com.easyimmo.mailsender.autoemail.dto;

import com.easyimmo.mailsender.contact.dto.ContactDto;
import com.easyimmo.mailsender.contact.model.Contact;
import com.easyimmo.mailsender.emailtemplate.model.EmailTemplate;

import javax.persistence.*;

public class AutoEmailDto {

    private Integer id;
    private String fromAdress;
    private EmailTemplate emailTemplate;
    private ContactDto contact;
    private Integer propertyId;

    public AutoEmailDto(Integer id, String fromAdress, EmailTemplate emailTemplate, ContactDto contact, Integer propertyId) {
        this.id = id;
        this.fromAdress = fromAdress;
        this.emailTemplate = emailTemplate;
        this.contact = contact;
        this.propertyId = propertyId;
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

    public ContactDto getContact() {
        return contact;
    }

    public void setContact(ContactDto contact) {
        this.contact = contact;
    }

    public Integer getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }
}
