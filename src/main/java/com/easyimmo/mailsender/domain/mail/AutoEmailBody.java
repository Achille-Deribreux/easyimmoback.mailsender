package com.easyimmo.mailsender.domain.mail;

public class AutoEmailBody {

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

        public AutoEmailBody build() {
            AutoEmailBody autoEmailBody = new AutoEmailBody();
            autoEmailBody.emailTemplateId = this.emailTemplateId;
            autoEmailBody.fromAdress = this.fromAdress;
            autoEmailBody.emailAdress = this.emailAdress;
            autoEmailBody.userId = this.userId;
            return autoEmailBody;
        }
    }
}
