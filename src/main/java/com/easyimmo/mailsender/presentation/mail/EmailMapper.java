package com.easyimmo.mailsender.presentation.mail;

import java.util.List;
import java.util.stream.Collectors;

import com.easyimmo.mailsender.domain.mail.model.AutoEmail;
import com.easyimmo.mailsender.domain.mail.model.Email;
import com.easyimmo.mailsender.domain.mail.model.MailStatus;
import com.easyimmo.mailsender.domain.mail.model.PlaceHolder;
import com.easyimmo.mailsender.infra.util.UserUtil;
import com.easyimmo.mailsender.presentation.mail.dto.PlaceHolderDto;
import com.easyimmo.mailsender.presentation.mail.dto.SendAutoEmailRequest;
import com.easyimmo.mailsender.presentation.mail.dto.EmailDto;

public class EmailMapper {

    private EmailMapper() {
    }

    public static Email toEmail(EmailDto emailDto){
        return new Email.Builder()
                .withFrom(emailDto.getFrom())
                .withTo(emailDto.getTo())
                .withSubject(emailDto.getSubject())
                .withText(emailDto.getText())
                .withMailStatus(MailStatus.TO_SEND)
                .build();
    }

    public static AutoEmail toAutoEmail(SendAutoEmailRequest autoEmail){
        return new AutoEmail.Builder()
                .withTo(autoEmail.getContactEmailAddress())
                .withFrom(autoEmail.getFromAddress())
                .withEmailTemplateId(autoEmail.getEmailTemplateId())
                .withSubjectPlaceholders(toPlaceHolder(autoEmail.getSubjectPlaceholders()))
                .withContentPlaceholders(toPlaceHolder(autoEmail.getContentPlaceholders()))
                .withMailStatus(MailStatus.TO_SEND)
                .withUserId(UserUtil.getCurrentUserId())
                .build();
    }

    private static List<PlaceHolder> toPlaceHolder(List<PlaceHolderDto> placeHolderDtos){
        return placeHolderDtos.stream()
                .map(placeHolderDto -> new PlaceHolder.Builder()
                        .withPlaceholderName(placeHolderDto.getPlaceholderName())
                        .withValue(placeHolderDto.getValue())
                        .build())
                .collect(Collectors.toList());
    }
}
