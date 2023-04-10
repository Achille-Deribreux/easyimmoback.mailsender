package com.easyimmo.mailsender.mail;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.easyimmo.mailsender.mail.dto.Email;

@RestController
@RequestMapping("/mail")
public class EmailSenderController {

    @Autowired
    EmailSenderService emailSenderService;

    @GetMapping("/helloWorld")
    public ResponseEntity<String> helloWorld(){
        return ResponseEntity.ok("Hello world");
    }

    @PostMapping("/send")
    public ResponseEntity<String> send(@RequestBody Email email) throws MessagingException {
        emailSenderService.sendMail(email);
        return ResponseEntity.ok("Sent");
    }
}
