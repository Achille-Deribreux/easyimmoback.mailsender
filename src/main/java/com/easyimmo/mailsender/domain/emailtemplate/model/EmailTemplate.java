package com.easyimmo.mailsender.domain.emailtemplate.model;

public class EmailTemplate {

    private Integer id;
    private String subject;
    private String content;
    private Integer userId;

    private EmailTemplate(Builder builder) {
        id = builder.id;
        subject = builder.subject;
        content = builder.content;
        userId = builder.userId;
    }

    public Integer getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }

    public Integer getUserId() {
        return userId;
    }


    public static final class Builder {
        private Integer id;
        private String subject;
        private String content;
        private Integer userId;

        public Builder() {
        }

        public Builder withId(Integer val) {
            id = val;
            return this;
        }

        public Builder withSubject(String val) {
            subject = val;
            return this;
        }

        public Builder withContent(String val) {
            content = val;
            return this;
        }

        public Builder withUserId(Integer val) {
            userId = val;
            return this;
        }

        public EmailTemplate build() {
            return new EmailTemplate(this);
        }
    }
}
