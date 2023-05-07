package com.easyimmo.mailsender.domain.mail.model;

import java.time.LocalDateTime;

public class Email {

    private String id;
    private String to;
    private String from;
    private String subject;
    private String text;

    private MailStatus mailStatus;

    private LocalDateTime sentTime;

    private Email(Builder builder) {
        id = builder.id;
        to = builder.to;
        from = builder.from;
        subject = builder.subject;
        text = builder.text;
        mailStatus = builder.mailStatus;
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

    public MailStatus getMailStatus() {
        return mailStatus;
    }

    public LocalDateTime getSentTime() {
        return sentTime;
    }

    public void hasBeenSent(){
        this.sentTime = LocalDateTime.now();
        this.mailStatus = MailStatus.SENT;
    }

    public static final class Builder {
        private String id;
        private String to;
        private String from;
        private String subject;
        private String text;
        private MailStatus mailStatus;
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

        public Builder withMailStatus(MailStatus val) {
            mailStatus = val;
            return this;
        }

        public Builder withSentTime(LocalDateTime val) {
            sentTime = val;
            return this;
        }

        public Email build() {
            return new Email(this);
        }
    }
}
