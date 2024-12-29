package StrategyDesignPattern.PaymentStrategy;
import strategyDesignPattern.PaymentStrategy;


public class PayPalStrategy implements PaymentStrategy{

    @Override
    public String paymentProcessor(double amount) {
        return "Processing payment with PayPal for amount: " + amount;
    }
    
}
