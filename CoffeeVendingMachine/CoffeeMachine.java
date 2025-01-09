package CoffeeVendingMachine;

import java.util.*;

public class CoffeeMachine {
    private static final CoffeeMachine instance = new CoffeeMachine();
    private final List<Coffee> coffeeMenu;
    private final Map<String, Ingredient> ingredients;

    private CoffeeMachine(){
        coffeeMenu = new ArrayList<>();
        ingredients = new HashMap<>();

        // Initialize coffee menu and ingredients
        initializeIngredients();
        initializeMenu();
    }

    public static CoffeeMachine getInstance(){
        return instance;
    }

    private void initializeMenu(){
        // Making of black coffee
        Map<Ingredient, Integer> blackCoffeeIngredients = new HashMap<>();
        blackCoffeeIngredients.put(ingredients.get("coffee"), 10);
        blackCoffeeIngredients.put(ingredients.get("sugar"), 5);
        coffeeMenu.add(new Coffee("black coffee",500, blackCoffeeIngredients));

        // Making of espresso coffee
        Map<Ingredient, Integer> espressoIngredients = new HashMap<>();
        espressoIngredients.put(ingredients.get("coffee"), 20);
        espressoIngredients.put(ingredients.get("milk"), 10);
        coffeeMenu.add(new Coffee("espresso", 400, espressoIngredients));

        // Making of latte coffee
        Map<Ingredient, Integer> latteIngredients = new HashMap<>();
        latteIngredients.put(ingredients.get("coffee"), 15);
        latteIngredients.put(ingredients.get("milk"), 25);
        latteIngredients.put(ingredients.get("sugar"), 10);
        coffeeMenu.add(new Coffee("latte", 600, latteIngredients));

    }

    private void initializeIngredients(){
        ingredients.put("coffee", new Ingredient("coffee", 100));
        ingredients.put("sugar", new Ingredient("sugar", 100));
        ingredients.put("milk", new Ingredient("milk", 100));
    }

    public void displayMenu(){
        System.out.println("Menu:");
        for (Coffee coffee : coffeeMenu){
            System.out.println(coffee.getName() + " - Rs. " + coffee.getPrice());
        }
    }

    public synchronized Coffee selectCoffee(String cofeeName){
        for (Coffee coffee : coffeeMenu){
            if (coffee.getName().equalsIgnoreCase(cofeeName)){
                return coffee;
            }
        }
        return null;
    }

    public synchronized void dispenseCofee(Coffee coffee, Payment payment){
        if(payment.getAmount()>=coffee.getPrice()){
            if(hasEnoughIngredients(coffee)){
                System.out.println("Dispensing " + coffee.getName()+ "...");
                updateIngredients(coffee);
                double change = payment.getAmount() - coffee.getPrice();
                if(change>0){
                    System.out.println("Please collect your change: Rs. " + change);
                }
            }
            else{
                System.out.println("Sorry, can't dispense, Insuffecient ingredients " + coffee.getName() + ". Please try again later.");
            }
        }
        else{
            System.out.println("Sorry, can't dispense, Insuffecient payment for " + coffee.getName() + ". Please try again later.");
        }
    }

    private boolean hasEnoughIngredients(Coffee coffee){
        Map<Ingredient, Integer> recipe = coffee.getRecipe();
        for (Map.Entry<Ingredient, Integer> entry : recipe.entrySet()){
            Ingredient ingredient = entry.getKey();
            int requiredQuantity = entry.getValue();
            if(ingredients.get(ingredient.getName()).getQuantity()<requiredQuantity){
                System.out.println("Sorry, not enough " + ingredient.getName() + " available.");
                return false;
            }
        }
        return true;
    }

    private void updateIngredients(Coffee coffee){
        for(Map.Entry<Ingredient, Integer> entry :coffee.getRecipe().entrySet()){
            Ingredient ingredient = entry.getKey();
            int requiredQuantity = entry.getValue();
            ingredient.updateQuantity(-requiredQuantity);
            if(ingredient.getQuantity()<3){
                System.out.println("Warning: Running low on " + ingredient.getName());
            }
        }
    }
}
