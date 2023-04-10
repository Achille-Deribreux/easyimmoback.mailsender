package com.easyimmo.mailsender.contact.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contact", schema = "MAILSENDER")
public class Contact {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "role")
    private String role;

    @Column(name = "emailAdress")
    private String emailAdress;

    @Column(name = "userId")
    private Integer userId;


    public Contact() {
    }

    public Contact(Integer id, String name, String role, String emailAdress, Integer userId) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.emailAdress = emailAdress;
        this.userId = userId;
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

    public String getRole() {
        return role;
    }

    public void setRole(String function) {
        this.role = function;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
