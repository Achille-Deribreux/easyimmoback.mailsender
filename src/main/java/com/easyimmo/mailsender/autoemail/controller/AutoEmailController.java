package com.easyimmo.mailsender.autoemail.controller;

import com.easyimmo.mailsender.autoemail.service.AutoEmailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/autoemail")
public class AutoEmailController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private AutoEmailService autoEmailService;

    public AutoEmailController(AutoEmailService autoEmailService) {
        this.autoEmailService = autoEmailService;
    }

    @PostMapping("/sendAutoEmailByProperty")
    public ResponseEntity<String> sendAutoEmailByProperty(@RequestParam Integer propertyId){
        logger.info("send auto email for property : {}",propertyId);
        autoEmailService.sendAutoEmailByProperty(propertyId);
        return ResponseEntity.ok("mail(s) sent");
    }
}
