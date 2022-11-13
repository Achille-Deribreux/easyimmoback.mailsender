package com.easyimmo.mailsender.emailtemplate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emailtemplate")
public class EmailTemplate {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "subject")
    private String subject;

    @Column(name="content")
    private String content;


    public EmailTemplate() {
    }

    public EmailTemplate(String subject, String content) {
        this.subject = subject;
        this.content = content;
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
}
