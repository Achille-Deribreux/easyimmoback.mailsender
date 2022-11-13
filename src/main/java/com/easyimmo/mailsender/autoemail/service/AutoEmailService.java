package com.easyimmo.mailsender.autoemail.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.easyimmo.mailsender.autoemail.model.AutoEmail;
import com.easyimmo.mailsender.autoemail.repository.AutoEmailRepository;
import com.easyimmo.mailsender.mail.EmailSenderService;

@Service
public class AutoEmailService implements IAutoEmailService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private AutoEmailRepository autoEmailRepository;

    private EmailSenderService emailSenderService;

    public AutoEmailService(AutoEmailRepository autoEmailRepository,EmailSenderService emailSenderService) {
        this.autoEmailRepository = autoEmailRepository;
        this.emailSenderService = emailSenderService;
    }

    public void sendAutoEmailByProperty(Integer propertyId){
        logger.info("send auto email for property id : {}",propertyId);
        autoEmailRepository.findAllByPropertyId(propertyId)
                .forEach(autoEmail -> emailSenderService.sendAutoEmail(autoEmail));
    }
}
