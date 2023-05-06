package com.easyimmo.mailsender.domain.mail;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.easyimmo.mailsender.domain.mail.model.AutoEmail;

import com.easyimmo.mailsender.domain.mail.model.Email;
import com.easyimmo.mailsender.domain.mail.model.MailStatus;

@Service
public class DefaultEmailService implements EmailService {

    private final EmailAdapter emailAdapter;

    public DefaultEmailService(EmailAdapter emailAdapter) {
        this.emailAdapter = emailAdapter;
    }

    @Override
    public void sendEmail(Email email) {
        emailAdapter.sendMail(email);
        email.setMailStatus(MailStatus.SENT);
        email.setSentTime(LocalDateTime.now());
        //TODO save email
    }

    @Override
    public void sendAutoEmail(AutoEmail autoEmail) {
        emailAdapter.sendAutoEmail(autoEmail);
        //TODO same logic as email
    }
}
