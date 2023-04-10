package com.easyimmo.mailsender.emailtemplate.service;

import com.easyimmo.mailsender.emailtemplate.model.EmailTemplate;
import com.easyimmo.mailsender.emailtemplate.repository.EmailTemplateRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class EmailTemplateService implements IEmailTemplateService{

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final EmailTemplateRepository emailTemplateRepository;

    public EmailTemplateService(EmailTemplateRepository emailTemplateRepository) {
        this.emailTemplateRepository = emailTemplateRepository;
    }

    @Override
    public EmailTemplate addEmailTemplate(EmailTemplate emailTemplate){
        logger.info("add email template for userId : {}", emailTemplate.getUserId());
        return emailTemplateRepository.save(emailTemplate);
    }
}
