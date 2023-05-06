package com.easyimmo.mailsender.infra.emailtemplate;

import com.easyimmo.mailsender.domain.emailtemplate.model.EmailTemplate;

public class EmailTemplateDbMapper {

    private EmailTemplateDbMapper() {
    }

    public static EmailTemplateEntity toEntity(EmailTemplate emailTemplate){
        return new EmailTemplateEntity.Builder()
                .withId(emailTemplate.getId())
                .withSubject(emailTemplate.getSubject())
                .withContent(emailTemplate.getContent())
                .withUserId(emailTemplate.getUserId())
                .build();
    }

    public static EmailTemplate toEmailTemplate(EmailTemplateEntity entity){
        return new EmailTemplate.Builder()
                .withId(entity.getId())
                .withSubject(entity.getSubject())
                .withContent(entity.getContent())
                .withUserId(entity.getUserId())
                .build();
    }
}
