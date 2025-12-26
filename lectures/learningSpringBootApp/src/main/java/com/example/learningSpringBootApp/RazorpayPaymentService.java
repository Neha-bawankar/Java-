package com.example.learningSpringBootApp;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperties;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperties(name = "payment.provider",havingValue = "razorpay")
public class RazorpayPaymentService implements PaymentService{
    public String pay(){
        String payment = "Razorpay Payment";
        System.out.println("Payment from " + payment);
        return payment;
    }
}
