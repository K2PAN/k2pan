package com.k2pan.api.services.payment;

import com.k2pan.api.interfaces.payment.IPaymentService;

public class StripePaymentService implements IPaymentService{
    @Override
    public void processPayment() {
        System.out.println("Stripe process");
    }
}
