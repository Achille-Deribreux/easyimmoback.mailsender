package com.easyimmo.mailsender.infra.mail;

public class EmailEntity {

    private String to;
    private String from;
    private String subject;
    private String text;

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


    public static final class EmailEntityBuilder {
        private String to;
        private String from;
        private String subject;
        private String text;

        EmailEntityBuilder() {
        }

        public static EmailEntityBuilder anEmailToSend() {
            return new EmailEntityBuilder();
        }

        public EmailEntityBuilder withTo(String to) {
            this.to = to;
            return this;
        }

        public EmailEntityBuilder withFrom(String from) {
            this.from = from;
            return this;
        }

        public EmailEntityBuilder withSubject(String subject) {
            this.subject = subject;
            return this;
        }

        public EmailEntityBuilder withText(String text) {
            this.text = text;
            return this;
        }

        public EmailEntity build() {
            EmailEntity emailEntity = new EmailEntity();
            emailEntity.subject = this.subject;
            emailEntity.to = this.to;
            emailEntity.text = this.text;
            emailEntity.from = this.from;
            return emailEntity;
        }
    }
}
