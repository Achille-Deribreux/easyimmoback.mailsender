package com.easyimmo.mailsender.infra.mail;

import com.easyimmo.mailsender.domain.mail.AutoEmail;
import com.easyimmo.mailsender.domain.mail.Email;

public interface EmailSenderAdapter {

    void sendMail(Email email);
    void sendAutoEmail(AutoEmail email);
}
