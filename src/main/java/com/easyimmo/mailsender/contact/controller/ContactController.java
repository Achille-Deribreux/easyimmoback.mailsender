package com.easyimmo.mailsender.contact.controller;


import com.easyimmo.mailsender.contact.dto.ContactDto;
import com.easyimmo.mailsender.contact.model.Contact;
import com.easyimmo.mailsender.contact.service.ContactService;
import com.easyimmo.mailsender.utils.Converter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class ContactController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    /**
     * Method which respond to a post request at /contact/addContact and allow you to add a new contact
     * @param contactDto contact you want to add
     * @return added contact, with id
     */
    @PostMapping("/addContact")
    public ResponseEntity<ContactDto> addContact(@RequestBody ContactDto contactDto){
        logger.info("post request received at /contact/addContact, add contact with mail address : {}", contactDto.getEmailAdress());
        Contact addedContact = contactService.addContact(Converter.convertToContact(contactDto));
        return new ResponseEntity<>(Converter.convertToContactDto(addedContact),HttpStatus.CREATED);
    }
}
