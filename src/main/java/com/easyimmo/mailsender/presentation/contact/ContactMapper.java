package com.easyimmo.mailsender.presentation.contact;

import com.easyimmo.mailsender.domain.contact.model.Contact;
import com.easyimmo.mailsender.presentation.contact.dto.CreateContactRequest;

public class ContactMapper {

    private ContactMapper() {
    }

    public static Contact toContact(CreateContactRequest createContactRequest) {
        return new Contact.Builder()
                .withId(createContactRequest.getId())
                .withName(createContactRequest.getName())
                .withRole(createContactRequest.getFunction())
                .withEmailAdress(createContactRequest.getEmailAdress())
                .withUserId(createContactRequest.getUserId())
                .build();
    }
}
