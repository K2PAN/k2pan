package com.k2pan.api.interfaces.email;

import javax.mail.MessagingException;

public interface IEmailService {
    void sendEmail(String recipientEmail, String subject, String body);
}
