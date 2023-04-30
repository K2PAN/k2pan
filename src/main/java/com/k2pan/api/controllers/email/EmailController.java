package com.k2pan.api.controllers.email;

import java.util.HashMap;
import java.util.Map;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.k2pan.api.services.email.EmailService;

@RestController
@RequestMapping("/mail")
public class EmailController {
    @Autowired
    private EmailService emailService;

    @PostMapping("/send")
    public Map<String, Boolean> sendMail(@Validated @RequestBody EmailRequest emailRequest) throws MessagingException {
        Map<String, Boolean> response = new HashMap<>();

        emailService.sendEmail(emailRequest.getRecipientEmail(), emailRequest.getSubject(), emailRequest.getBody());
        response.put("State",  Boolean.TRUE);
        return response;
    }
}
