package Strategy-Design-Pattern.payment-strategy;

public class Main {
    public static void main(String[] args) {
        PaymentStrategy payPalStrategy = new PayPalStrategy();
        PaymentStrategy stripeStrategy = new StripeStrategy();
        PaymentStrategy bankStrategy = new BankStrategy();

        PaymentProcessor paymentProcessor = new PaymentProcessor(paypalStrategy);
        double amount = 100;
        String result = paymentProcessor.processPayment(amount);
        System.out.println(result);

        paymentProcessor.setPaymentStrategy(stripeStrategy);
        result = paymentProcessor.processPayment(amount);
        System.err.println(result);

        
    }
}
