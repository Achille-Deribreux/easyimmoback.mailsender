package com.easyimmo.mailsender.emailtemplate.service;

import com.easyimmo.mailsender.emailtemplate.model.EmailTemplate;

public interface IEmailTemplateService {

    /**
     * Method which create an emailTemplate
     * @param emailTemplate you want to add
     * @return added emailTemplate, with id
     */
    EmailTemplate addEmailTemplate(EmailTemplate emailTemplate);
}
