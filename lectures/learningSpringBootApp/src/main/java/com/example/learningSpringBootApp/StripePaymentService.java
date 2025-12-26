package com.example.learningSpringBootApp;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperties;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperties(name = "payment.provider",havingValue = "Stripe")

public class StripePaymentService implements PaymentService {

      public String pay(){
          String payment = "Stripe Payment ";
          System.out.println("Paying from... " + payment);
          return payment;
      }
}
