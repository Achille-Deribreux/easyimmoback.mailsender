package com.easyimmo.mailsender.domain.emailtemplate;

import com.easyimmo.mailsender.domain.emailtemplate.model.EmailTemplate;

public interface EmailTemplateAdapter {
    EmailTemplate create(EmailTemplate emailTemplate);
}
