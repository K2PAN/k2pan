package com.k2pan.api.services.payment;

import com.k2pan.api.interfaces.payment.IPaymentService;

public class PaymentServiceFactory {
    public IPaymentService createPaymentMethod(String type) {
        IPaymentService iPaymentService = null;
        if (type == "paypal"){
            iPaymentService =  new PaypalPaymentService();
        }
        else if (type == "stripe"){
            iPaymentService = new StripePaymentService();
        }
        return iPaymentService;
    }
}
