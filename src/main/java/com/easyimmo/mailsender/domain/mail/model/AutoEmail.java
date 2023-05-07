package com.easyimmo.mailsender.domain.mail.model;

import java.time.LocalDateTime;
import java.util.List;

public class AutoEmail {
    private Integer id;
    private String to;
    private String from;
    private Integer emailTemplateId;
    private List<PlaceHolder> subjectPlaceholders;
    private List<PlaceHolder> contentPlaceholders;
    private MailStatus mailStatus;
    private LocalDateTime sentTime;
    private String subject;
    private String content;
    private String userId;

    public AutoEmail() {
    }

    private AutoEmail(Builder builder) {
        id = builder.id;
        to = builder.to;
        from = builder.from;
        emailTemplateId = builder.emailTemplateId;
        subjectPlaceholders = builder.subjectPlaceholders;
        contentPlaceholders = builder.contentPlaceholders;
        mailStatus = builder.mailStatus;
        sentTime = builder.sentTime;
        userId = builder.userId;
    }

    public Integer getId() {
        return id;
    }

    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }

    public Integer getEmailTemplateId() {
        return emailTemplateId;
    }

    public List<PlaceHolder> getSubjectPlaceholders() {
        return subjectPlaceholders;
    }

    public List<PlaceHolder> getContentPlaceholders() {
        return contentPlaceholders;
    }

    public MailStatus getMailStatus() {
        return mailStatus;
    }

    public LocalDateTime getSentTime() {
        return sentTime;
    }

    public String getUserId() {
        return userId;
    }

    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }

    public void buildSubjectAndContent(String subject, String content){
        this.subject = subject;
        this.content = content;
    }

    public void hasBeenSent(){
        this.sentTime = LocalDateTime.now();
        this.mailStatus = MailStatus.SENT;
    }

    public static final class Builder {
        private Integer id;
        private String to;
        private String from;
        private Integer emailTemplateId;
        private List<PlaceHolder> subjectPlaceholders;
        private List<PlaceHolder> contentPlaceholders;
        private MailStatus mailStatus;
        private LocalDateTime sentTime;
        private String userId;

        public Builder() {
        }

        public Builder withId(Integer val) {
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

        public Builder withEmailTemplateId(Integer val) {
            emailTemplateId = val;
            return this;
        }

        public Builder withSubjectPlaceholders(List<PlaceHolder> val) {
            subjectPlaceholders = val;
            return this;
        }

        public Builder withContentPlaceholders(List<PlaceHolder> val) {
            contentPlaceholders = val;
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

        public Builder withUserId(String val) {
            userId = val;
            return this;
        }

        public AutoEmail build() {
            return new AutoEmail(this);
        }
    }
}