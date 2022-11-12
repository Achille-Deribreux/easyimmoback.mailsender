package com.easyimmo.mailsender.mail;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mail")
public class EmailSenderController {

    @Autowired
    EmailSenderService emailSenderService;

    @GetMapping("/helloWorld")
    public ResponseEntity<String> helloWorld(){
        return ResponseEntity.ok("Hello world");
    }

    @GetMapping("/send")
    public ResponseEntity<String> send() throws MessagingException {
        emailSenderService.sendMail();
        return ResponseEntity.ok("Sent");
    }
}
