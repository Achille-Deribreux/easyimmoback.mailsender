package com.easyimmo.mailsender.infra.mail;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.easyimmo.mailsender.infra.mail.entity.EmailEntity;
import com.easyimmo.mailsender.infra.mail.entity.SendEmailRequest;

@Service
public class EmailSender {

    private final JavaMailSender mailSender;

    public EmailSender(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendMail(SendEmailRequest request){
        try {
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(message);
            mimeMessageHelper.setText(request.getText());
            mimeMessageHelper.setSubject(request.getSubject());
            mimeMessageHelper.setFrom(request.getFrom());
            mimeMessageHelper.setTo(request.getTo());
            mimeMessageHelper.setReplyTo(request.getFrom());
            message.setRecipients(Message.RecipientType.TO, request.getTo());
            mailSender.send(message);
        }catch (MessagingException e){
            //TODO : custom exception
        }
    }
}


