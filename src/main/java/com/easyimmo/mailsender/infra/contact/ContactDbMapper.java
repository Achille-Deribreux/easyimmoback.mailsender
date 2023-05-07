package com.easyimmo.mailsender.infra.contact;

import com.easyimmo.mailsender.domain.contact.model.Contact;
import com.easyimmo.mailsender.infra.contact.ContactEntity;

public class ContactDbMapper {

    private ContactDbMapper() {
    }

    public static ContactEntity toEntity(Contact contact) {
        return new ContactEntity.Builder()
                .withName(contact.getName())
                .withRole(contact.getRole())
                .withEmailAdress(contact.getEmailAdress())
                .withUserId(contact.getUserId())
                .build();
    }
}
