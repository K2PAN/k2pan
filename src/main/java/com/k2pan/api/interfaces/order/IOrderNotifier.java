package com.k2pan.api.interfaces.order;

import javax.mail.MessagingException;

import com.k2pan.api.models.order.Order;

public interface IOrderNotifier {
    void sendNotification(Order order, String message);

}
