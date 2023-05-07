package com.easyimmo.mailsender.domain.mail;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.easyimmo.mailsender.domain.mail.model.AutoEmail;

import com.easyimmo.mailsender.domain.mail.model.Email;
import com.easyimmo.mailsender.domain.mail.model.MailStatus;
import com.easyimmo.mailsender.domain.mail.model.PlaceHolder;

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
        emailAdapter.saveEmail(email);
    }

    @Override
    public void sendAutoEmail(AutoEmail autoEmail) {
        String subject = null;//TODO
        String content = null;
        autoEmail.buildSubjectAndContent(subject, content);
        emailAdapter.sendAutoEmail(autoEmail);
        //TODO same logic as email
        autoEmail.hasBeenSent();
        emailAdapter.saveAutoEmail(autoEmail);
    }

    private String replacePlaceHolders(String text, List<PlaceHolder> placeHolders){
        for (PlaceHolder placeHolder : placeHolders) {
            text = text.replace(placeHolder.getPlaceholderName(), placeHolder.getValue());
        }
        return text;
    }
}
