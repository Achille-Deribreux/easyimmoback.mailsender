package com.easyimmo.mailsender.infra.mail;

import org.springframework.stereotype.Component;

import com.easyimmo.mailsender.domain.mail.EmailAdapter;
import com.easyimmo.mailsender.domain.mail.model.AutoEmail;
import com.easyimmo.mailsender.domain.mail.model.Email;
import com.easyimmo.mailsender.infra.mail.entity.EmailEntity;

@Component
public class DefaultEmailAdapter implements EmailAdapter {

    //TODO ADD LOGIC

    private final EmailSender emailSender;
    private final EmailJpaRepository emailRepository;
    private final AutoEmailJpaRepository autoEmailRepository;

    public DefaultEmailAdapter(EmailSender emailSender, EmailJpaRepository emailRepository, AutoEmailJpaRepository autoEmailRepository) {
        this.emailSender = emailSender;
        this.emailRepository = emailRepository;
        this.autoEmailRepository = autoEmailRepository;
    }

    @Override
    public void sendMail(Email email) {
        emailSender.sendMail(EmailInfraMapper.toSendEmailRequest(email));
    }

    @Override
    public void sendAutoEmail(AutoEmail email) {
        emailSender.sendMail(EmailInfraMapper.toSendEmailRequest(email));
    }

    @Override
    public void saveEmail(Email email) {
        emailRepository.save(EmailInfraMapper.toEmailEntity(email));
    }

    @Override
    public void saveAutoEmail(AutoEmail email) {
        autoEmailRepository.save(EmailInfraMapper.toAutoEmailEntity(email));
    }
}
