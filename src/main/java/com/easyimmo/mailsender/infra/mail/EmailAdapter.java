package com.easyimmo.mailsender.infra.mail;

import com.easyimmo.mailsender.domain.mail.model.AutoEmail;
import com.easyimmo.mailsender.domain.mail.model.Email;

public interface EmailAdapter {

    void sendMail(Email email);
    void sendAutoEmail(AutoEmail email);
}
