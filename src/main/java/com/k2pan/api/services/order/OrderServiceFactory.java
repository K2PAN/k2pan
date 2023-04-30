package com.k2pan.api.services.order;

import com.k2pan.api.interfaces.order.IOrderNotifier;
import com.k2pan.api.services.email.EmailService;

public class OrderServiceFactory {
    private EmailService emailService;

    public OrderServiceFactory(){
        this.emailService = new EmailService();
    }
    public IOrderNotifier createNotifyOrderMethod(String type){
        IOrderNotifier iOrderNotifier = null;
        if (type == "email"){
            iOrderNotifier = new EmailOrderNotifier(this.emailService);
        }
        else if (type == "sms"){
            iOrderNotifier = new SmsOrderNotifier();
        }
        return iOrderNotifier;
    }
}
