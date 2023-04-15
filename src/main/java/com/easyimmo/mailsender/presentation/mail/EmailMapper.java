package com.easyimmo.mailsender.presentation.mail;

import com.easyimmo.mailsender.domain.mail.model.AutoEmail;
import com.easyimmo.mailsender.domain.mail.model.Email;
import com.easyimmo.mailsender.presentation.mail.dto.AutoEmailDto;
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

    public static AutoEmail toAutoEmail(AutoEmailDto autoEmail){
        return new AutoEmail.Builder()
                .withContactEmailAddress(autoEmail.getContactEmailAddress())
                .withEmailTemplateId(autoEmail.getEmailTemplateId())
                .withFromAdress(autoEmail.getFromAdress())
                .withUserId(autoEmail.getUserId())
                .build();
    }
}
