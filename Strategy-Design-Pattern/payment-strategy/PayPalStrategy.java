package Strategy-Design-Pattern.payment-strategy;
import Strategy.PaymentStrategy;


public class PayPalStrategy implements PaymentStrategy{

    @Override
    public String paymentProcessor(double amount) {
        return "Processing payment with PayPal for amount: " + amount;
    }
    
}
