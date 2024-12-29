package DecoratorDesignPattern;

public class MushRoom extends Decorator {
    BasePizza basePizza;
    public MushRoom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public double cost() {
        return basePizza.cost() + 40;
    }
    
}
