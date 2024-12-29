package DecoratorDesignPattern;

public class ExtraCheese extends Decorator{
    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public double cost() {
        return basePizza.cost() + 70;
    }
    
}
