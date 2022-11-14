package com.easyimmo.mailsender.contact.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.easyimmo.mailsender.contact.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact,Integer> {
}
