package com.easyimmo.mailsender.presentation.mail;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.easyimmo.mailsender.domain.mail.AutoEmailBody;
import com.easyimmo.mailsender.domain.mail.Email;
import com.easyimmo.mailsender.domain.mail.EmailService;

@RestController
@RequestMapping("/mail")
public class EmailController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    EmailService emailService;

    @GetMapping("/helloWorld")
    public ResponseEntity<String> helloWorld(){
        return ResponseEntity.ok("Hello world");
    }

    //TODO LOGS
    @PostMapping("/email/send")
    public ResponseEntity<String> send(@RequestBody EmailDto emailDto) {
        emailService.sendEmail(toEmail(emailDto));
        return ResponseEntity.ok("Sent");
    }


    @PostMapping("/add")
    public ResponseEntity<AutoEmailDto> addAutoEmail(@RequestBody AutoEmailBodyDto autoEmailBodyDto){
        logger.info("request received at /autoemail/add for to address : {}", autoEmailBodyDto.getEmailAdress());
        emailService.addAutoEmail(toAutoEmailBody(autoEmailBodyDto));
        return new ResponseEntity<>(HttpStatus.CREATED);
    }



    private Email toEmail(EmailDto emailDto){
        return new Email.EmailBuilder()
                .withFrom(emailDto.getFrom())
                .withTo(emailDto.getTo())
                .withSubject(emailDto.getSubject())
                .withText(emailDto.getText())
                .build();
    }

    private AutoEmailBody toAutoEmailBody(AutoEmailBodyDto autoEmailBodyDto){
        return new AutoEmailBody.AutoEmailBodyBuilder()
                .withEmailAdress(autoEmailBodyDto.getEmailAdress())
                .withEmailTemplateId(autoEmailBodyDto.getEmailTemplateId())
                .withFromAdress(autoEmailBodyDto.getFromAdress())
                .withUserId(autoEmailBodyDto.getUserId())
                .build();
    }
}
