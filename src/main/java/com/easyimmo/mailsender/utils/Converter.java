package com.easyimmo.mailsender.utils;

import com.easyimmo.mailsender.autoemail.dto.AutoEmailDto;
import com.easyimmo.mailsender.autoemail.model.AutoEmail;
import com.easyimmo.mailsender.contact.dto.ContactDto;
import com.easyimmo.mailsender.contact.model.Contact;

public class Converter {

    public static Contact convertToContact(ContactDto contactDto){
        return new Contact(
                contactDto.getId(),
                contactDto.getName(),
                contactDto.getFunction(),
                contactDto.getEmailAdress()
        );
    }

    public static ContactDto convertToContactDto(Contact contact){
        return new ContactDto(
                contact.getId(),
                contact.getName(),
                contact.getFunction(),
                contact.getEmailAdress()
        );
    }

    public static AutoEmailDto convertToAutoEmailDto(AutoEmail autoEmail){
        return new AutoEmailDto(
                autoEmail.getId(),
                autoEmail.getFromAdress(),
                autoEmail.getEmailTemplate(),
                convertToContactDto(autoEmail.getContact()),
                autoEmail.getPropertyId()
        );
    }

    public static AutoEmail convertToAutoEmail(AutoEmailDto autoEmailDto){
        return new AutoEmail(
                autoEmailDto.getId(),
                autoEmailDto.getFromAdress(),
                autoEmailDto.getEmailTemplate(),
                convertToContact(autoEmailDto.getContact()),
                autoEmailDto.getPropertyId()
        );
    }
}
