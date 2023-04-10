package com.easyimmo.mailsender.autoemail.service;

import com.easyimmo.mailsender.autoemail.model.AutoEmail;

public interface IAutoEmailService {


    /**
     * Method which sends all saved auto emails for a given property
     * @param propertyId id of the property which you want to send emails
     */
    void sendAutoEmailByProperty(Integer propertyId);


    /**
     * Method which creates an auto email
     * @param autoEmail you want to create
     * @return added autoEmail, with id
     */
    AutoEmail addAutoEmail(AutoEmail autoEmail);
}
