package com.k2pan.api.controllers.email;
//public void sendEmail(String recipientEmail, String subject, String body) throws MessagingException {

public class EmailRequest {
    private String recipientEmail;
    private String subject;
    private String body;

    public EmailRequest(String recipientEmail,String subject,String body) {
        this.body = body;
        this.recipientEmail = recipientEmail;
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public String getRecipientEmail() {
        return recipientEmail;
    }

    public String getSubject() {
        return subject;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setRecipientEmail(String recipientEmail) {
        this.recipientEmail = recipientEmail;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}
