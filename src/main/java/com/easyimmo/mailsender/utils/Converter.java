package com.easyimmo.mailsender.utils;

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
}
