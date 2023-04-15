package com.easyimmo.mailsender.domain.mail;

import org.springframework.stereotype.Service;

import com.easyimmo.mailsender.domain.mail.model.AutoEmail;
import com.easyimmo.mailsender.domain.mail.model.Email;

@Service
public class DefaultEmailService implements EmailService {

    private final EmailAdapter emailAdapter;

    public DefaultEmailService(EmailAdapter emailAdapter) {
        this.emailAdapter = emailAdapter;
    }

    @Override
    public void sendEmail(Email email) {
        emailAdapter.sendMail(email);
    }

    @Override
    public void sendAutoEmail(AutoEmail autoEmail) {
        emailAdapter.sendAutoEmail(autoEmail);
    }

}
