package com.easyimmo.mailsender.presentation.mailtemplate.dto;

public class CreateEmailTemplateRequest {

    private Integer id;
    private String subject;
    private String content;

    private Integer userId;

    public CreateEmailTemplateRequest(Integer id, String subject, String content, Integer userId) {
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
