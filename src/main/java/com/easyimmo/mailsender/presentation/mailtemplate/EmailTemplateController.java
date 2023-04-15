package com.easyimmo.mailsender.presentation.mailtemplate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.easyimmo.mailsender.domain.emailtemplate.DefaultEmailTemplateService;
import com.easyimmo.mailsender.presentation.mailtemplate.dto.CreateEmailTemplateRequest;

@RestController
@RequestMapping("/emailtemplate")
public class EmailTemplateController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final DefaultEmailTemplateService defaultEmailTemplateService;

    public EmailTemplateController(DefaultEmailTemplateService defaultEmailTemplateService) {
        this.defaultEmailTemplateService = defaultEmailTemplateService;
    }

    @PostMapping("/add")
    public ResponseEntity<Void> addEmailTemplateDto(@RequestBody CreateEmailTemplateRequest createEmailTemplateRequest){
        logger.info("post request received at /emailtemplate/add to add an email template for user id : {}", createEmailTemplateRequest.getUserId());
        defaultEmailTemplateService.addEmailTemplate(EmailTemplateMapper.toEmailTemplate(createEmailTemplateRequest));
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}