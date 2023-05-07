package com.easyimmo.mailsender.domain.emailtemplate;

import com.easyimmo.mailsender.domain.emailtemplate.model.EmailTemplate;

public interface EmailTemplateService {

    /**
     * Method which create an emailTemplate
     * @param emailTemplate you want to add
     * @return added emailTemplate, with id
     */
    EmailTemplate addEmailTemplate(EmailTemplate emailTemplate);

    EmailTemplate getEmailTemplate(Integer emailTemplateId);
}
