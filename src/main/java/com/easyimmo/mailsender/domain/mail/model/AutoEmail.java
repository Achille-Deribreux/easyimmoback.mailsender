package com.easyimmo.mailsender.domain.mail.model;

public class AutoEmail {
    private Integer id;
    private String fromAdress;
    private Integer emailTemplateId;
    private String contactEmailAddress;
    private Integer userId;

    private AutoEmail(Builder builder) {
        id = builder.id;
        fromAdress = builder.fromAdress;
        emailTemplateId = builder.emailTemplateId;
        contactEmailAddress = builder.contactEmailAddress;
        userId = builder.userId;
    }

    public Integer getId() {
        return id;
    }

    public String getFromAdress() {
        return fromAdress;
    }

    public Integer getEmailTemplateId() {
        return emailTemplateId;
    }

    public String getContactEmailAddress() {
        return contactEmailAddress;
    }

    public Integer getUserId() {
        return userId;
    }


    public static final class Builder {
        private Integer id;
        private String fromAdress;
        private Integer emailTemplateId;
        private String contactEmailAddress;
        private Integer userId;

        public Builder() {
        }

        public Builder withId(Integer val) {
            id = val;
            return this;
        }

        public Builder withFromAdress(String val) {
            fromAdress = val;
            return this;
        }

        public Builder withEmailTemplateId(Integer val) {
            emailTemplateId = val;
            return this;
        }

        public Builder withContactEmailAddress(String val) {
            contactEmailAddress = val;
            return this;
        }

        public Builder withUserId(Integer val) {
            userId = val;
            return this;
        }

        public AutoEmail build() {
            return new AutoEmail(this);
        }
    }
}
