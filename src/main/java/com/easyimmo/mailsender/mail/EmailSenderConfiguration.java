package com.easyimmo.mailsender.mail;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class EmailSenderConfiguration {

    @Bean
    public JavaMailSender getJavaMailSender(){
        JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
        javaMailSender.setHost("ssl0.ovh.net");
        javaMailSender.setPort(465);
        javaMailSender.setUsername("dev@deribreux.be");
        javaMailSender.setPassword("X");
        Properties props = javaMailSender.getJavaMailProperties();
        props.put("mail.smtp.ssl.enable", "true");
        props.put("email.transport.protocol", "smtp");
        return javaMailSender;
    }
}
