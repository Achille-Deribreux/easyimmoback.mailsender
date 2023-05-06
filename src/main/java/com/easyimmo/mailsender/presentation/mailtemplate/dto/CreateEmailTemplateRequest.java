package com.easyimmo.mailsender.presentation.mailtemplate.dto;

public class CreateEmailTemplateRequest {
    private String subject;
    private String content;

    public CreateEmailTemplateRequest() {
    }

    private CreateEmailTemplateRequest(Builder builder) {
        subject = builder.subject;
        content = builder.content;
    }

    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }


    public static final class Builder {
        private String subject;
        private String content;

        public Builder() {
        }

        public Builder withSubject(String val) {
            subject = val;
            return this;
        }

        public Builder withContent(String val) {
            content = val;
            return this;
        }

        public CreateEmailTemplateRequest build() {
            return new CreateEmailTemplateRequest(this);
        }
    }
}
