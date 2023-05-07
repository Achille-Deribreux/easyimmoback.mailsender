package com.easyimmo.mailsender.domain.mail;

import java.util.List;

import org.springframework.stereotype.Service;

import com.easyimmo.mailsender.domain.emailtemplate.EmailTemplateService;
import com.easyimmo.mailsender.domain.emailtemplate.model.EmailTemplate;
import com.easyimmo.mailsender.domain.mail.model.AutoEmail;
import com.easyimmo.mailsender.domain.mail.model.Email;
import com.easyimmo.mailsender.domain.mail.model.PlaceHolder;

@Service
public class DefaultEmailService implements EmailService {

    private final EmailAdapter emailAdapter;
    private final EmailTemplateService emailTemplateService;

    public DefaultEmailService(EmailAdapter emailAdapter, EmailTemplateService emailTemplateService) {
        this.emailAdapter = emailAdapter;
        this.emailTemplateService = emailTemplateService;
    }

    @Override
    public void sendEmail(Email email) {
        emailAdapter.sendMail(email);
        email.hasBeenSent();
        emailAdapter.saveEmail(email);
    }

    @Override
    public void sendAutoEmail(AutoEmail autoEmail) {
        EmailTemplate emailTemplate = emailTemplateService.getEmailTemplate(autoEmail.getEmailTemplateId());
        String subject = replacePlaceHolders(emailTemplate.getSubject(), autoEmail.getSubjectPlaceholders());
        String content = replacePlaceHolders(emailTemplate.getContent(), autoEmail.getContentPlaceholders());
        autoEmail.buildSubjectAndContent(subject, content);
        emailAdapter.sendAutoEmail(autoEmail);
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
