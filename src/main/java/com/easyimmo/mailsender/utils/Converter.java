package com.easyimmo.mailsender.utils;

import com.easyimmo.mailsender.autoemail.dto.AutoEmailDto;
import com.easyimmo.mailsender.autoemail.model.AutoEmail;
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
                contact.getFunction(),
                contact.getEmailAdress(),
                contact.getUserId()
        );
    }

    public static AutoEmailDto convertToAutoEmailDto(AutoEmail autoEmail){
        return new AutoEmailDto(
                autoEmail.getId(),
                autoEmail.getFromAdress(),
                autoEmail.getEmailTemplate(),
                convertToContactDto(autoEmail.getContact()),
                autoEmail.getPropertyId(),
                autoEmail.getUserId()
        );
    }

    public static AutoEmail convertToAutoEmail(AutoEmailDto autoEmailDto){
        return new AutoEmail(
                autoEmailDto.getId(),
                autoEmailDto.getFromAdress(),
                autoEmailDto.getEmailTemplate(),
                convertToContact(autoEmailDto.getContact()),
                autoEmailDto.getPropertyId(),
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
