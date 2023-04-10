package com.easyimmo.mailsender.emailtemplate.controller;

import com.easyimmo.mailsender.emailtemplate.dto.EmailTemplateDto;
import com.easyimmo.mailsender.emailtemplate.model.EmailTemplate;
import com.easyimmo.mailsender.emailtemplate.service.EmailTemplateService;
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
@RequestMapping("/emailtemplate")
public class EmailTemplateController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final EmailTemplateService emailTemplateService;

    public EmailTemplateController(EmailTemplateService emailTemplateService) {
        this.emailTemplateService = emailTemplateService;
    }

    /**
     * Method which respond at a post request at /emailtemplate/add and creates a new emailTemplate
     * @param emailTemplateDto emailTemplate you want to add
     * @return added emailTemplate, with id and http code 201
     */
    @PostMapping("/add")
    public ResponseEntity<EmailTemplateDto> addEmailTemplateDto(@RequestBody EmailTemplateDto emailTemplateDto){
        logger.info("post request received at /emailtemplate/add to add an email template for user id : {}", emailTemplateDto.getUserId());
        EmailTemplate addedEmailTemplate = emailTemplateService.addEmailTemplate(Converter.convertToEmailTemplate(emailTemplateDto));
        return new ResponseEntity<>(Converter.convertToEmailTemplateDto(addedEmailTemplate), HttpStatus.CREATED);
    }
}
