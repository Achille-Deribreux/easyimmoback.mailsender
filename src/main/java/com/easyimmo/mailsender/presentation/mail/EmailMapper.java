package com.easyimmo.mailsender.presentation.mail;

import com.easyimmo.mailsender.domain.mail.model.CreateAutoEmailRequest;
import com.easyimmo.mailsender.domain.mail.model.Email;
import com.easyimmo.mailsender.presentation.mail.dto.EmailDto;

public class EmailMapper {

    private EmailMapper() {
    }

    public static Email toEmail(EmailDto emailDto){
        return new Email.EmailBuilder()
                .withFrom(emailDto.getFrom())
                .withTo(emailDto.getTo())
                .withSubject(emailDto.getSubject())
                .withText(emailDto.getText())
                .build();
    }

    public static CreateAutoEmailRequest toAutoEmailBody(com.easyimmo.mailsender.presentation.mail.dto.CreateAutoEmailRequest createAutoEmailRequest){
        return new CreateAutoEmailRequest.AutoEmailBodyBuilder()
                .withEmailAdress(createAutoEmailRequest.getEmailAdress())
                .withEmailTemplateId(createAutoEmailRequest.getEmailTemplateId())
                .withFromAdress(createAutoEmailRequest.getFromAdress())
                .withUserId(createAutoEmailRequest.getUserId())
                .build();
    }
}
