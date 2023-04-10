package com.easyimmo.mailsender.utils;

import com.easyimmo.mailsender.presentation.mail.AutoEmailDto;
import com.easyimmo.mailsender.infra.mail.AutoEmailEntity;
import com.easyimmo.mailsender.contact.dto.ContactDto;
import com.easyimmo.mailsender.contact.model.Contact;
import com.easyimmo.mailsender.emailtemplate.dto.EmailTemplateDto;
import com.easyimmo.mailsender.emailtemplate.model.EmailTemplate;

public class Converter {

    private Converter() {}

    public static Contact convertToContact(ContactDto contactDto){
        return new Contact(
                contactDto.getId(),
                contactDto.getName(),
                contactDto.getFunction(),
                contactDto.getEmailAdress(),
                contactDto.getUserId()
        );
    }

    public static ContactDto convertToContactDto(Contact contact){
        return new ContactDto(
                contact.getId(),
                contact.getName(),
                contact.getRole(),
                contact.getEmailAdress(),
                contact.getUserId()
        );
    }

    public static AutoEmailDto convertToAutoEmailDto(AutoEmailEntity autoEmailEntity){
        return new AutoEmailDto(
                autoEmailEntity.getId(),
                autoEmailEntity.getFromAdress(),
                autoEmailEntity.getEmailTemplate(),
                convertToContactDto(autoEmailEntity.getContact()),
                autoEmailEntity.getUserId()
        );
    }

    public static AutoEmailEntity convertToAutoEmail(AutoEmailDto autoEmailDto){
        return new AutoEmailEntity(
                autoEmailDto.getId(),
                autoEmailDto.getFromAdress(),
                autoEmailDto.getEmailTemplate(),
                convertToContact(autoEmailDto.getContact()),
                autoEmailDto.getUserId()
        );
    }

    public static EmailTemplateDto convertToEmailTemplateDto(EmailTemplate emailTemplate){
        return new EmailTemplateDto(
                emailTemplate.getId(),
                emailTemplate.getSubject(),
                emailTemplate.getContent(),
                emailTemplate.getUserId()
        );
    }

    public static EmailTemplate convertToEmailTemplate(EmailTemplateDto emailTemplateDto){
        return new EmailTemplate(
                emailTemplateDto.getId(),
                emailTemplateDto.getSubject(),
                emailTemplateDto.getContent(),
                emailTemplateDto.getUserId()
        );
    }
}
