package DecoratorDesignPattern;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new MushRoom(new Margarita());
        System.out.println(pizza.cost());
        BasePizza pizza2 = new ExtraCheese(new MushRoom(new FarmHouse()));
        System.out.println(pizza2.cost());
        pizza = new MushRoom(pizza);
        System.out.println(pizza.cost());
    }
    
}
