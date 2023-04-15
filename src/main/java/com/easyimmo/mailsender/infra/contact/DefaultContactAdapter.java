package com.easyimmo.mailsender.infra.contact;

import org.springframework.stereotype.Component;

import com.easyimmo.mailsender.domain.contact.ContactAdapter;
import com.easyimmo.mailsender.domain.contact.model.Contact;

@Component
public class DefaultContactAdapter implements ContactAdapter {

        private final ContactJpaRepository contactJpaRepository;

        public DefaultContactAdapter(ContactJpaRepository contactJpaRepository) {
            this.contactJpaRepository = contactJpaRepository;
        }

        @Override
        public void createContact(Contact contact) {
            contactJpaRepository.save(toEntity(contact));
        }

        private ContactEntity toEntity(Contact contact) {
            return new ContactEntity.Builder()
                    .withName(contact.getName())
                    .withRole(contact.getRole())
                    .withEmailAdress(contact.getEmailAdress())
                    .withUserId(contact.getUserId())
                    .build();
        }
}