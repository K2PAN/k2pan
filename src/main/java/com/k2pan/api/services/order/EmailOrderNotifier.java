package com.k2pan.api.services.order;

import javax.mail.MessagingException;

import org.springframework.stereotype.Component;

import com.k2pan.api.interfaces.email.IEmailService;
import com.k2pan.api.interfaces.order.IOrderNotifier;
import com.k2pan.api.models.order.Order;


public class EmailOrderNotifier implements IOrderNotifier {
    IEmailService iEmailService;

    public EmailOrderNotifier(IEmailService iEmailService) {
        this.iEmailService = iEmailService;
    }

    @Override
    public void sendNotification(Order order, String message) {
        String subject =  "Order " + order.getId() + " status update";
        String content = "Dear " + order.getCustomerName() + ",\n\n" + message;
        String email = order.getCustomerEmail();
        // System.out.println("Email:" + message);
        iEmailService.sendEmail(email, subject, content);
    }
}
