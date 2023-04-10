package com.easyimmo.mailsender.domain.mail;

import org.springframework.stereotype.Service;

import com.easyimmo.mailsender.infra.mail.EmailSenderAdapter;

@Service
public class DefaultEmailService implements EmailService {

    private final EmailSenderAdapter emailSenderAdapter;

    public DefaultEmailService(EmailSenderAdapter emailSenderAdapter) {
        this.emailSenderAdapter = emailSenderAdapter;
    }

    @Override
    public void sendEmail(Email email) {
        emailSenderAdapter.sendMail(email);
    }

    @Override
    public void sendAutoEmail(AutoEmail autoEmail) {
        emailSenderAdapter.sendAutoEmail(autoEmail);
    }

    @Override
    public void addAutoEmail(AutoEmailBody autoEmailBody) {
        //TODO IMPLEMENT
    }
}
