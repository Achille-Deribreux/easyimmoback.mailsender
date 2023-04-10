package com.easyimmo.mailsender.domain.mail;

public interface EmailService {

    void sendEmail(Email email);
    void sendAutoEmail(AutoEmail autoEmail);
    void addAutoEmail(AutoEmailBody autoEmailBody);
}
