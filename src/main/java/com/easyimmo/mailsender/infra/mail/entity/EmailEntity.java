package com.easyimmo.mailsender.infra.mail.entity;

import java.time.LocalDateTime;

public class EmailEntity {

    private String id;
    private String to;
    private String from;
    private String subject;
    private String text;
    private MailEntityStatus status;
    private LocalDateTime sentTime;

    private EmailEntity(Builder builder) {
        id = builder.id;
        to = builder.to;
        from = builder.from;
        subject = builder.subject;
        text = builder.text;
        status = builder.status;
        sentTime = builder.sentTime;
    }

    public String getId() {
        return id;
    }

    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }

    public String getSubject() {
        return subject;
    }

    public String getText() {
        return text;
    }

    public MailEntityStatus getStatus() {
        return status;
    }

    public LocalDateTime getSentTime() {
        return sentTime;
    }


    public static final class Builder {
        private String id;
        private String to;
        private String from;
        private String subject;
        private String text;
        private MailEntityStatus status;
        private LocalDateTime sentTime;

        public Builder() {
        }

        public Builder withId(String val) {
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

        public Builder withSubject(String val) {
            subject = val;
            return this;
        }

        public Builder withText(String val) {
            text = val;
            return this;
        }

        public Builder withStatus(MailEntityStatus val) {
            status = val;
            return this;
        }

        public Builder withSentTime(LocalDateTime val) {
            sentTime = val;
            return this;
        }

        public EmailEntity build() {
            return new EmailEntity(this);
        }
    }
}
