package com.easyimmo.mailsender.domain.mail;

import com.easyimmo.mailsender.domain.mail.model.AutoEmail;
import com.easyimmo.mailsender.domain.mail.model.Email;

public interface EmailService {

    void sendEmail(Email email);
    void sendAutoEmail(AutoEmail autoEmail);
}
