package de.codewithmario.store;

public class StripePaymentService implements PaymentService {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment with Stripe");
        System.out.println("Amount: " + amount);
    }
}
