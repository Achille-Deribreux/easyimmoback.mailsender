package com.easyimmo.mailsender.infra.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class EmailSenderConfiguration {

    @Value("${spring.email.sender.host}")
    private String host;

    @Value("${spring.email.sender.port}")
    private Integer port;

    @Value("${spring.email.sender.username}")
    private String username;

    @Value("${spring.email.sender.password}")
    private String password;



    @Bean
    public JavaMailSender getJavaMailSender(){
        JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
        javaMailSender.setHost(host);
        javaMailSender.setPort(port);
        javaMailSender.setUsername(username);
        javaMailSender.setPassword(password);
        Properties props = javaMailSender.getJavaMailProperties();
        props.put("mail.smtp.ssl.enable", "true");
        props.put("email.transport.protocol", "smtp");
        return javaMailSender;
    }
}
