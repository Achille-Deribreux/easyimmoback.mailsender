package com.easyimmo.mailsender.autoemail.controller;

import com.easyimmo.mailsender.autoemail.dto.AutoEmailDto;
import com.easyimmo.mailsender.autoemail.model.AutoEmail;
import com.easyimmo.mailsender.autoemail.service.AutoEmailService;
import com.easyimmo.mailsender.utils.Converter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/autoemail")
public class AutoEmailController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final AutoEmailService autoEmailService;

    public AutoEmailController(AutoEmailService autoEmailService) {
        this.autoEmailService = autoEmailService;
    }

    /**
     * Method which respond to a request at /autoemail/sendByProperty and allows to send all saved auto emails for a given property
     * @param propertyId id of the property which you want to send the emails
     * @return message to tell it's done and http code 200
     */
    @PostMapping("/sendByProperty")
    public ResponseEntity<String> sendAutoEmailByProperty(@RequestParam Integer propertyId){
        logger.info("send auto email for property : {}",propertyId);
        autoEmailService.sendAutoEmailByProperty(propertyId);
        return ResponseEntity.ok("mail(s) sent");
    }

    /**
     * Method which respond to a request at /autoemail/add and create an autoEmail
     * @param autoEmailDto autoEmail you want to add
     * @return added autoEmail
     */
    @PostMapping("/add")
    public ResponseEntity<AutoEmailDto> addAutoEmail(@RequestBody AutoEmailDto autoEmailDto){
        logger.info("request received at /autoemail/add for to address : {}", autoEmailDto.getContact().getEmailAdress());
        AutoEmail addedAutoEmail = autoEmailService.addAutoEmail(Converter.convertToAutoEmail(autoEmailDto));
        return new ResponseEntity<>(Converter.convertToAutoEmailDto(addedAutoEmail), HttpStatus.CREATED);
    }
}
