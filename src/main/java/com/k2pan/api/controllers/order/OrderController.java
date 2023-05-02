package com.k2pan.api.controllers.order;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.k2pan.api.models.order.Order;
import com.k2pan.api.services.email.EmailService;
import com.k2pan.api.services.order.EmailOrderNotifier;
import com.k2pan.api.services.order.OrderService;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    public OrderController() {

    }

    @PostMapping(value = "/send")
    public void updateOrderStatus(@RequestBody Order order) {
        orderService.updateOrderStatus(order);
    }

}
