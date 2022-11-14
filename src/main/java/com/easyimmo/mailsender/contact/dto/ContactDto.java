package com.easyimmo.mailsender.contact.dto;

import javax.persistence.Column;
import javax.persistence.Id;

public class ContactDto {

    private Integer id;
    private String name;
    private String function;
    private String emailAdress;

    public ContactDto() {
    }

    public ContactDto(Integer id, String name, String function, String emailAdress) {
        this.id = id;
        this.name = name;
        this.function = function;
        this.emailAdress = emailAdress;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }
}
