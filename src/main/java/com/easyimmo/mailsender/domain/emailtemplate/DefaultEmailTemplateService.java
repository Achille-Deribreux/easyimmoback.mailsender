package com.easyimmo.mailsender.domain.emailtemplate;

import com.easyimmo.mailsender.domain.emailtemplate.model.EmailTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DefaultEmailTemplateService implements EmailTemplateService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final EmailTemplateAdapter emailTemplateAdapter;

    public DefaultEmailTemplateService(EmailTemplateAdapter emailTemplateAdapter) {
        this.emailTemplateAdapter = emailTemplateAdapter;
    }

    @Override
    public EmailTemplate addEmailTemplate(EmailTemplate emailTemplate){
        logger.info("add email template for userId : {}", emailTemplate.getUserId());
        return emailTemplateAdapter.create(emailTemplate);
    }

    @Override
    public EmailTemplate getEmailTemplate(Integer emailTemplateId) {
        return null; //TODO
    }
}
