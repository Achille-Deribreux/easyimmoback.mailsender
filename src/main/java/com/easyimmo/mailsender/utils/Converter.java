package com.easyimmo.mailsender.utils;

import com.easyimmo.mailsender.presentation.mail.dto.AutoEmailDto;
import com.easyimmo.mailsender.infra.mail.entity.AutoEmailEntity;
import com.easyimmo.mailsender.contact.dto.ContactDto;
import com.easyimmo.mailsender.contact.model.Contact;
import com.easyimmo.mailsender.presentation.mailtemplate.dto.CreateEmailTemplateRequest;
import com.easyimmo.mailsender.infra.emailtemplate.EmailTemplateEntity;

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

    public static CreateEmailTemplateRequest convertToEmailTemplateDto(EmailTemplateEntity emailTemplateEntity){
        return new CreateEmailTemplateRequest(
                emailTemplateEntity.getId(),
                emailTemplateEntity.getSubject(),
                emailTemplateEntity.getContent(),
                emailTemplateEntity.getUserId()
        );
    }

    public static EmailTemplateEntity convertToEmailTemplate(CreateEmailTemplateRequest createEmailTemplateRequest){
        return new EmailTemplateEntity(
                createEmailTemplateRequest.getId(),
                createEmailTemplateRequest.getSubject(),
                createEmailTemplateRequest.getContent(),
                createEmailTemplateRequest.getUserId()
        );
    }
}
