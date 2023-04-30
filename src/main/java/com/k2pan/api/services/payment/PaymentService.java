package com.k2pan.api.services.payment;

import org.springframework.stereotype.Service;

import com.k2pan.api.interfaces.payment.IPaymentService;

@Service
public class PaymentService {

    public void paymentProcessing(String params) {
        PaymentServiceFactory factory = new PaymentServiceFactory();
        IPaymentService paymentService = factory.createPaymentMethod(params);
        paymentService.processPayment();
    }

}
