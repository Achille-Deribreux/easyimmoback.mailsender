package com.easyimmo.mailsender.presentation.mailtemplate;

import com.easyimmo.mailsender.domain.emailtemplate.model.EmailTemplate;
import com.easyimmo.mailsender.presentation.mailtemplate.dto.CreateEmailTemplateRequest;

public class EmailTemplateMapper {

    private EmailTemplateMapper() {
    }

    public static EmailTemplate toEmailTemplate(CreateEmailTemplateRequest createEmailTemplateRequest){
        return new EmailTemplate.Builder()
                .withUserId(createEmailTemplateRequest.getUserId())
                .withSubject(createEmailTemplateRequest.getSubject())
                .withContent(createEmailTemplateRequest.getContent())
                .build();
    }
}
