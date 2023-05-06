package com.easyimmo.mailsender.infra.emailtemplate;

import org.springframework.stereotype.Component;

import com.easyimmo.mailsender.domain.emailtemplate.EmailTemplateAdapter;
import com.easyimmo.mailsender.domain.emailtemplate.model.EmailTemplate;
import com.easyimmo.mailsender.infra.mail.EmailJpaRepository;

@Component
public class DefaultEmailTemplateAdapter implements EmailTemplateAdapter {

    private final EmailTemplateJpaRepository emailTemplateJpaRepository;

    public DefaultEmailTemplateAdapter(EmailTemplateJpaRepository emailTemplateJpaRepository) {
        this.emailTemplateJpaRepository = emailTemplateJpaRepository;
    }

    @Override
    public EmailTemplate create(EmailTemplate emailTemplate) {
        EmailTemplateEntity savedTemplate = emailTemplateJpaRepository.save(EmailTemplateDbMapper.toEntity(emailTemplate));
        return EmailTemplateDbMapper.toEmailTemplate(savedTemplate);
    }
}
