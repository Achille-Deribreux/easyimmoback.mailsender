package com.easyimmo.mailsender.domain.emailtemplate.model;

public class EmailTemplate {

    private final Integer id;
    private final String subject;
    private final String content;
    private final String userId;

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

    public String getUserId() {
        return userId;
    }


    public static final class Builder {
        private Integer id;
        private String subject;
        private String content;
        private String userId;

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

        public Builder withUserId(String val) {
            userId = val;
            return this;
        }

        public EmailTemplate build() {
            return new EmailTemplate(this);
        }
    }
}
