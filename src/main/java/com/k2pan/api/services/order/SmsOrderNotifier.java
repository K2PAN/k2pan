package com.k2pan.api.services.order;

import com.k2pan.api.interfaces.order.IOrderNotifier;
import com.k2pan.api.models.order.Order;
import com.k2pan.api.services.email.EmailService;

public class SmsOrderNotifier implements IOrderNotifier {
    @Override
    public void sendNotification(Order order, String message) {
        System.out.println("SMS:" + message);
    }
}
