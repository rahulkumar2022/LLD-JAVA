package StrategyDesignPattern.PaymentStrategy;
import strategy.designpattern.PaymentStrategy;


public class StripeStrategy implements PaymentStrategy{

    @Override
    public String paymentProcessor(double amount) {
        return "Processing payment with Stripe for amount: " + amount;
    }
    
}
