package CoffeeVendingMachine;

public class CoffeeVendingMachine {
    
    public static void run(){
        CoffeeMachine coffeeMachine = CoffeeMachine.getInstance();
        coffeeMachine.displayMenu();

        Payment payment = new Payment(500);
        coffeeMachine.dispenseCofee(coffeeMachine.selectCoffee("black coffee"), payment);

        // Simulate user requests
        Coffee espresso = coffeeMachine.selectCoffee("Espresso");
        coffeeMachine.dispenseCofee(espresso, payment);

        // Coffee cappuccino = coffeeMachine.selectCoffee("Cappuccino");
        // coffeeMachine.dispenseCofee(cappuccino, new Payment(3.5));


        Coffee latte = coffeeMachine.selectCoffee("Latte");
        coffeeMachine.dispenseCofee(latte, new Payment(3000.0));
    }
}
