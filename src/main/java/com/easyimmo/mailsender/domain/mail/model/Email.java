package com.easyimmo.mailsender.domain.mail.model;

public class Email {

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


    public static final class EmailBuilder {
        private String to;
        private String from;
        private String subject;
        private String text;

        public EmailBuilder() {
        }

        public static EmailBuilder anEmail() {
            return new EmailBuilder();
        }

        public EmailBuilder withTo(String to) {
            this.to = to;
            return this;
        }

        public EmailBuilder withFrom(String from) {
            this.from = from;
            return this;
        }

        public EmailBuilder withSubject(String subject) {
            this.subject = subject;
            return this;
        }

        public EmailBuilder withText(String text) {
            this.text = text;
            return this;
        }

        public Email build() {
            Email email = new Email();
            email.from = this.from;
            email.text = this.text;
            email.to = this.to;
            email.subject = this.subject;
            return email;
        }
    }
}
