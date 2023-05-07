package com.easyimmo.mailsender.presentation.mail.dto;

import java.util.List;

public class SendAutoEmailRequest {

    private String fromAddress;
    private Integer emailTemplateId;
    private String contactEmailAddress;
    private List<PlaceHolderDto> subjectPlaceholders;
    private List<PlaceHolderDto> contentPlaceholders;

    public SendAutoEmailRequest() {
    }

    private SendAutoEmailRequest(Builder builder) {
        fromAddress = builder.fromAdress;
        emailTemplateId = builder.emailTemplateId;
        contactEmailAddress = builder.contactEmailAddress;
        subjectPlaceholders = builder.subjectPlaceholders;
        contentPlaceholders = builder.contentPlaceholders;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public Integer getEmailTemplateId() {
        return emailTemplateId;
    }

    public String getContactEmailAddress() {
        return contactEmailAddress;
    }

    public List<PlaceHolderDto> getSubjectPlaceholders() {
        return subjectPlaceholders;
    }

    public List<PlaceHolderDto> getContentPlaceholders() {
        return contentPlaceholders;
    }

    public static final class Builder {
        private String fromAdress;
        private Integer emailTemplateId;
        private String contactEmailAddress;
        private List<PlaceHolderDto> subjectPlaceholders;
        private List<PlaceHolderDto> contentPlaceholders;

        public Builder() {
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

        public Builder withSubjectPlaceholders(List<PlaceHolderDto> val) {
            subjectPlaceholders = val;
            return this;
        }

        public Builder withContentPlaceholders(List<PlaceHolderDto> val) {
            contentPlaceholders = val;
            return this;
        }

        public SendAutoEmailRequest build() {
            return new SendAutoEmailRequest(this);
        }
    }
}
