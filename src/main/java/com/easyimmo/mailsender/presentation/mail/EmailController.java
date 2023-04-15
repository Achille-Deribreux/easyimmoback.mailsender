package com.easyimmo.mailsender.presentation.mail;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.easyimmo.mailsender.domain.mail.EmailService;
import com.easyimmo.mailsender.presentation.mail.dto.AutoEmailDto;
import com.easyimmo.mailsender.presentation.mail.dto.EmailDto;

@RestController
@RequestMapping("/mail")
public class EmailController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    //TODO LOGS
    @PostMapping("/email/send")
    public ResponseEntity<String> send(@RequestBody EmailDto emailDto) {
        emailService.sendEmail(EmailMapper.toEmail(emailDto));
        return ResponseEntity.ok("Sent");
    }


    @PostMapping("/auto-email/send")
    public ResponseEntity<AutoEmailDto> sendAutoEmail(@RequestBody AutoEmailDto autoEmailDto){
        logger.info("request received at /autoemail/add for to address : {}", autoEmailDto.getContactEmailAddress());
        emailService.sendAutoEmail(EmailMapper.toAutoEmail(autoEmailDto));
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
