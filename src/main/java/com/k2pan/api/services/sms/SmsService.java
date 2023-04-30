package com.k2pan.api.services.sms;

import com.k2pan.api.interfaces.sms.ISmsService;

public class SmsService implements ISmsService {
    @Override
    public void sendSMS() {
        System.out.println("SMS sent");
    }
}
