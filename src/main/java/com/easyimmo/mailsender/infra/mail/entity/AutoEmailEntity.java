package com.easyimmo.mailsender.infra.mail.entity;


import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.easyimmo.mailsender.domain.mail.model.MailStatus;
import com.easyimmo.mailsender.domain.mail.model.PlaceHolder;
import com.easyimmo.mailsender.infra.contact.ContactEntity;
import com.easyimmo.mailsender.infra.emailtemplate.EmailTemplateEntity;

//@Entity TODO
//@Table(name = "autoemail", schema = "MAILSENDER")
public class AutoEmailEntity {

    private Integer id;
    private String to;
    private String from;
    private Integer emailTemplateId;
    private MailEntityStatus mailStatus;
    private LocalDateTime sentTime;
    private String subject;
    private String content;
    private String userId;

    public AutoEmailEntity() {
    }

    private AutoEmailEntity(Builder builder) {
        id = builder.id;
        to = builder.to;
        from = builder.from;
        emailTemplateId = builder.emailTemplateId;
        mailStatus = builder.mailStatus;
        sentTime = builder.sentTime;
        subject = builder.subject;
        content = builder.content;
        userId = builder.userId;
    }

    public Integer getId() {
        return id;
    }

    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }

    public Integer getEmailTemplateId() {
        return emailTemplateId;
    }

    public MailEntityStatus getMailStatus() {
        return mailStatus;
    }

    public LocalDateTime getSentTime() {
        return sentTime;
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
        private String to;
        private String from;
        private Integer emailTemplateId;
        private MailEntityStatus mailStatus;
        private LocalDateTime sentTime;
        private String subject;
        private String content;
        private String userId;

        public Builder() {
        }

        public Builder withId(Integer val) {
            id = val;
            return this;
        }

        public Builder withTo(String val) {
            to = val;
            return this;
        }

        public Builder withFrom(String val) {
            from = val;
            return this;
        }

        public Builder withEmailTemplateId(Integer val) {
            emailTemplateId = val;
            return this;
        }

        public Builder withMailStatus(MailEntityStatus val) {
            mailStatus = val;
            return this;
        }

        public Builder withSentTime(LocalDateTime val) {
            sentTime = val;
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

        public AutoEmailEntity build() {
            return new AutoEmailEntity(this);
        }
    }
}
