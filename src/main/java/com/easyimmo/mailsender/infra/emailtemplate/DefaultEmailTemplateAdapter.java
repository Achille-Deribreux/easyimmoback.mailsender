package com.easyimmo.mailsender.infra.emailtemplate;

import org.springframework.stereotype.Component;

import com.easyimmo.mailsender.domain.emailtemplate.EmailTemplateAdapter;
import com.easyimmo.mailsender.domain.emailtemplate.model.EmailTemplate;

@Component
public class DefaultEmailTemplateAdapter implements EmailTemplateAdapter {

    @Override
    public EmailTemplate create(EmailTemplate emailTemplate) {
        return null;
    }
}
