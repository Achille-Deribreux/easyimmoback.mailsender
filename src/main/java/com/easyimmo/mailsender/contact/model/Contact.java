package com.easyimmo.mailsender.contact.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contact")
public class Contact {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "function")
    private String function;

    @Column(name = "emailAdress")
    private String emailAdress;

    public Contact() {
    }

    public Contact(Integer id, String name, String function, String emailAdress) {
        this.id = id;
        this.name = name;
        this.function = function;
        this.emailAdress = emailAdress;
    }

    public Contact(String name, String function, String emailAdress) {
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
