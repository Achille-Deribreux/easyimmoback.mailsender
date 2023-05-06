package com.easyimmo.mailsender.domain.mail.model;

import java.time.LocalDateTime;

public class Email {

    private String to;
    private String from;
    private String subject;
    private String text;

    private MailStatus mailStatus;

    private LocalDateTime sentTime;

    private Email(Builder builder) {
        setTo(builder.to);
        setFrom(builder.from);
        setSubject(builder.subject);
        setText(builder.text);
        setMailStatus(builder.mailStatus);
        setSentTime(builder.sentTime);
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public MailStatus getMailStatus() {
        return mailStatus;
    }

    public void setMailStatus(MailStatus mailStatus) {
        this.mailStatus = mailStatus;
    }

    public LocalDateTime getSentTime() {
        return sentTime;
    }

    public void setSentTime(LocalDateTime sentTime) {
        this.sentTime = sentTime;
    }


    public static final class Builder {
        private String to;
        private String from;
        private String subject;
        private String text;
        private MailStatus mailStatus;
        private LocalDateTime sentTime;

        public Builder() {
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
