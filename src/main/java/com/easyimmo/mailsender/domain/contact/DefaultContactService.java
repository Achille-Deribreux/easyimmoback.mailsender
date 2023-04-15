package com.easyimmo.mailsender.domain.contact;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.easyimmo.mailsender.domain.contact.model.Contact;

@Service
public class DefaultContactService implements ContactService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final ContactAdapter contactAdapter;

    public DefaultContactService(ContactAdapter contactAdapter) {
        this.contactAdapter = contactAdapter;
    }

    public void addContact(Contact contact){
        logger.info("add contact with mail address : {}", contact.getEmailAdress());
        contactAdapter.createContact(contact);
    }
}
