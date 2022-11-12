package com.easyimmo.mailsender.mail;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendMail() throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(message);
        mimeMessageHelper.setText("this is text");
        mimeMessageHelper.setSubject("this is subject");
        mimeMessageHelper.setFrom("deribreuxachille0@gmail.com ");
        mimeMessageHelper.setTo("achille7780@gmail.com");
        mimeMessageHelper.setReplyTo("achille@deribreux.be");
        message.setRecipients(Message.RecipientType.TO,"aditsolutions.be@gmail.com");
        mailSender.send(message);
    }
}
