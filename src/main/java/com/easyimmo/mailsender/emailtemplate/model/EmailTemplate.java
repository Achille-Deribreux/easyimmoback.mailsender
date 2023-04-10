package com.easyimmo.mailsender.emailtemplate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emailtemplate", schema = "MAILSENDER")
public class EmailTemplate {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "subject")
    private String subject;

    @Column(name="content")
    private String content;

    @Column(name = "userId")
    private Integer userId;


    public EmailTemplate() {
    }

    public EmailTemplate(Integer id, String subject, String content, Integer userId) {
        this.id = id;
        this.subject = subject;
        this.content = content;
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
