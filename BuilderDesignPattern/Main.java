package BuilderDesignPattern;

public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger.BurgerBuilder().size("Large")
            .cheese(true)
            .meat(true)
            .tomato(true)
            .build();
        System.out.println(burger.getSize());
        System.out.println(burger.hasCheese());
        System.out.println(burger.hasMeat());
        System.out.println(burger.hasTomato());
    }
}
