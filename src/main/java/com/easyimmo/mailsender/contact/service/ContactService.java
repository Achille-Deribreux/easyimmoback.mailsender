package com.easyimmo.mailsender.contact.service;

import com.easyimmo.mailsender.contact.repository.ContactRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.easyimmo.mailsender.contact.model.Contact;

@Service
public class ContactService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    /**
     * Method which add a contact
     * @param contact  to add
     * @return added contact with id
     */
    public Contact addContact(Contact contact){
        logger.info("add contact with mail address : {}", contact.getEmailAdress());
        return contactRepository.save(contact);
    }
}
