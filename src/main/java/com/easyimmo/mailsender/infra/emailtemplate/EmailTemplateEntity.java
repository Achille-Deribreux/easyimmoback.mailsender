package com.easyimmo.mailsender.infra.emailtemplate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emailtemplate", schema = "MAILSENDER")
public class EmailTemplateEntity {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "subject")
    private String subject;

    @Column(name="content")
    private String content;

    @Column(name = "userId")
    private String userId;


    public EmailTemplateEntity() {
    }

    private EmailTemplateEntity(Builder builder) {
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

        public EmailTemplateEntity build() {
            return new EmailTemplateEntity(this);
        }
    }
}
