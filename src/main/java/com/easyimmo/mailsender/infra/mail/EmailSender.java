package com.easyimmo.mailsender.infra.mail;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.easyimmo.mailsender.presentation.mail.EmailDto;

@Service
public class EmailSender {

    private final JavaMailSender mailSender;

    public EmailSender(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendMail(EmailEntity emailEntity){
        try {
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(message);
            mimeMessageHelper.setText(emailEntity.getText());
            mimeMessageHelper.setSubject(emailEntity.getSubject());
            mimeMessageHelper.setFrom(emailEntity.getFrom());
            mimeMessageHelper.setTo(emailEntity.getTo());
            mimeMessageHelper.setReplyTo(emailEntity.getFrom());
            message.setRecipients(Message.RecipientType.TO, emailEntity.getTo());
            mailSender.send(message);
        }catch (MessagingException e){
            //TODO : custom exception
        }
    }
}
