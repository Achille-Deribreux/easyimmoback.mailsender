package com.easyimmo.mailsender.mail;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.easyimmo.mailsender.mail.dto.Email;

@Service
public class EmailSenderService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendMail(Email email) throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(message);
        mimeMessageHelper.setText(email.getText());
        mimeMessageHelper.setSubject(email.getSubject());
        mimeMessageHelper.setFrom(email.getFrom());
        mimeMessageHelper.setTo(email.getTo());
        mimeMessageHelper.setReplyTo(email.getFrom());
        message.setRecipients(Message.RecipientType.TO,email.getTo());
        mailSender.send(message);
    }
}
