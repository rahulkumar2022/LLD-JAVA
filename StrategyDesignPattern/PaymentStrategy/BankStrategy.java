package StrategyDesignPattern.PaymentStrategy;

import StrategyDesignPattern.paymentStrategy.PaymentStrategy;


public class BankStrategy implements PaymentStrategy {
    @Override
    public String paymentProcessor(double amount) {
        return "Processing payment with Bank for amount: " + amount;
    }
}