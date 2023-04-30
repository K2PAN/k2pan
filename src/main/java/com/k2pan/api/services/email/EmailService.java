package com.k2pan.api.services.email;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;

import com.k2pan.api.interfaces.email.IEmailService;

import java.util.Properties;

@Service
public class EmailService implements IEmailService {

    public void sendEmail(String recipientEmail, String subject, String body) {
        // Set up the properties for the Gmail SMTP server
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        // Set up the username and password for authentication
        Authenticator auth = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("quoc20121998@gmail.com", "jvujvtrthwdvbxtc");
            }
        };

        // Create a new session with the SMTP server
        Session session = Session.getInstance(props, auth);
        MimeMessage msg = new MimeMessage(session);

        try {
        // Create a new email message
        msg.setFrom(new InternetAddress("K2 <quoc20121998@gmail.com>"));
        msg.setRecipient(Message.RecipientType.TO, new InternetAddress(recipientEmail));
        msg.setSubject(subject, "UTF-8");
        msg.setText(body, "UTF-8");

        // Send the email message
        Transport.send(msg);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
