package com.easyimmo.mailsender.infra.mail;

import org.springframework.stereotype.Component;

import com.easyimmo.mailsender.domain.mail.AutoEmail;
import com.easyimmo.mailsender.domain.mail.Email;

@Component
public class DefaultEmailSenderAdapter implements EmailSenderAdapter {

    private final EmailSender emailSender;

    public DefaultEmailSenderAdapter(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    @Override
    public void sendMail(Email email) {
        emailSender.sendMail(toEmailEntity(email));
    }

    @Override
    public void sendAutoEmail(AutoEmail email) {
        //TODO IMPLEMENT
    }

    private EmailEntity toEmailEntity(Email email){
        return new EmailEntity.EmailEntityBuilder()
                .withFrom(email.getFrom())
                .withTo(email.getTo())
                .withSubject(email.getSubject())
                .withText(email.getText())
                .build();
    }
}
