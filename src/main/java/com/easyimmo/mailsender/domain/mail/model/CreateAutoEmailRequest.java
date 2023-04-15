package com.easyimmo.mailsender.domain.mail.model;

public class CreateAutoEmailRequest {

    private String fromAdress;
    private Integer emailTemplateId;
    private String emailAdress;
    private Integer userId;

    public String getFromAdress() {
        return fromAdress;
    }

    public Integer getEmailTemplateId() {
        return emailTemplateId;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public Integer getUserId() {
        return userId;
    }


    public static final class AutoEmailBodyBuilder {
        private String fromAdress;
        private Integer emailTemplateId;
        private String emailAdress;
        private Integer userId;

        public AutoEmailBodyBuilder() {
        }

        public static AutoEmailBodyBuilder anAutoEmailBody() {
            return new AutoEmailBodyBuilder();
        }

        public AutoEmailBodyBuilder withFromAdress(String fromAdress) {
            this.fromAdress = fromAdress;
            return this;
        }

        public AutoEmailBodyBuilder withEmailTemplateId(Integer emailTemplateId) {
            this.emailTemplateId = emailTemplateId;
            return this;
        }

        public AutoEmailBodyBuilder withEmailAdress(String emailAdress) {
            this.emailAdress = emailAdress;
            return this;
        }

        public AutoEmailBodyBuilder withUserId(Integer userId) {
            this.userId = userId;
            return this;
        }

        public CreateAutoEmailRequest build() {
            CreateAutoEmailRequest createAutoEmailRequest = new CreateAutoEmailRequest();
            createAutoEmailRequest.emailTemplateId = this.emailTemplateId;
            createAutoEmailRequest.fromAdress = this.fromAdress;
            createAutoEmailRequest.emailAdress = this.emailAdress;
            createAutoEmailRequest.userId = this.userId;
            return createAutoEmailRequest;
        }
    }
}
