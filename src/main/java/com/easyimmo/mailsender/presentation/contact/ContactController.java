package com.easyimmo.mailsender.presentation.contact;


import com.easyimmo.mailsender.domain.contact.ContactService;
import com.easyimmo.mailsender.presentation.contact.dto.CreateContactRequest;
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
     * @param createContactRequest contact you want to add
     * @return added contact, with id
     */
    @PostMapping("/addContact")
    public ResponseEntity<Void> addContact(@RequestBody CreateContactRequest createContactRequest){
        logger.info("post request received at /contact/addContact, add contact with mail address : {}", createContactRequest.getEmailAdress());
        contactService.addContact(ContactMapper.toContact(createContactRequest));
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
