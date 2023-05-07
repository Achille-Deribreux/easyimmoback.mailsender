package com.easyimmo.mailsender.infra.mail;

import com.easyimmo.mailsender.domain.mail.model.AutoEmail;
import com.easyimmo.mailsender.domain.mail.model.Email;
import com.easyimmo.mailsender.domain.mail.model.MailStatus;
import com.easyimmo.mailsender.infra.mail.entity.AutoEmailEntity;
import com.easyimmo.mailsender.infra.mail.entity.EmailEntity;
import com.easyimmo.mailsender.infra.mail.entity.MailEntityStatus;
import com.easyimmo.mailsender.infra.mail.entity.SendEmailRequest;
import com.easyimmo.mailsender.infra.util.EnumMapper;

public class EmailInfraMapper {

    private EmailInfraMapper() {
    }

    private static final EnumMapper<MailStatus, MailEntityStatus> mailStatusMapper = new EnumMapper<>();
    static {
        mailStatusMapper.add(MailStatus.TO_SEND, MailEntityStatus.TO_SEND);
        mailStatusMapper.add(MailStatus.SENT, MailEntityStatus.SENT);
        mailStatusMapper.add(MailStatus.ERROR, MailEntityStatus.ERROR);
    }

    public static EmailEntity toEmailEntity(Email email) {
        return new EmailEntity.Builder()
                .withId(email.getId())
                .withTo(email.getTo())
                .withFrom(email.getFrom())
                .withSubject(email.getSubject())
                .withText(email.getText())
                .withStatus(mailStatusMapper.toBack(email.getMailStatus()))
                .withSentTime(email.getSentTime())
                .build();
    }

    public static Email toEmail(EmailEntity emailEntity) {
        return new Email.Builder()
                .withId(emailEntity.getId())
                .withTo(emailEntity.getTo())
                .withFrom(emailEntity.getFrom())
                .withSubject(emailEntity.getSubject())
                .withText(emailEntity.getText())
                .withMailStatus(mailStatusMapper.toFront(emailEntity.getStatus()))
                .withSentTime(emailEntity.getSentTime())
                .build();
    }

    public static SendEmailRequest toSendEmailRequest(Email email) {
        return new SendEmailRequest.Builder()
                .withTo(email.getTo())
                .withFrom(email.getFrom())
                .withSubject(email.getSubject())
                .withText(email.getText())
                .build();
    }

    public static SendEmailRequest toSendEmailRequest(AutoEmail email) {
        return new SendEmailRequest.Builder()
                .withTo(email.getTo())
                .withFrom(email.getFrom())
                .withSubject(email.getSubject())
                .withText(email.getContent())
                .build();
    }

    public static AutoEmailEntity toAutoEmailEntity(AutoEmail email) {
      return new AutoEmailEntity.Builder()
              .withId(email.getId())
              .withTo(email.getTo())
              .withFrom(email.getFrom())
              .withSubject(email.getSubject())
              .withContent(email.getContent())
              .withMailStatus(mailStatusMapper.toBack(email.getMailStatus()))
              .withSentTime(email.getSentTime())
              .build();
    }
}
