package com.easyimmo.mailsender.infra.mail.entity;

public class SendEmailRequest {
    private final String to;
    private final String from;
    private final String subject;
    private final String text;

    private SendEmailRequest(Builder builder) {
        to = builder.to;
        from = builder.from;
        subject = builder.subject;
        text = builder.text;
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


    public static final class Builder {
        private String to;
        private String from;
        private String subject;
        private String text;

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

        public SendEmailRequest build() {
            return new SendEmailRequest(this);
        }
    }
}
