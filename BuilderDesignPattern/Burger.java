package BuilderDesignPattern;

public class Burger {
    private String size;
    private boolean cheese;
    private boolean meat;
    private boolean tomato;

    private Burger(BurgerBuilder builder) {
        // this.size = builder.size;
        // this.cheese = builder.cheese;
        // this.mean = builder.mean;
        // this.tomato = builder.tomato;
    }

    public String getSize(){
        return size;
    }
    public boolean hasCheese(){
        return cheese;
    }
    public boolean hasMeat(){
        return meat;
    }

    public boolean hasTomato(){
        return tomato;
    }

    public static class BurgerBuilder {
        private String size;
        private boolean cheese;
        private boolean meat;
        private boolean tomato;

        public BurgerBuilder() {
        }

        public BurgerBuilder size(String size) {
            this.size = size;
            return this;
        }

        public BurgerBuilder cheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public BurgerBuilder meat(boolean meat) {
            this.meat = meat;
            return this;
        }

        public BurgerBuilder tomato(boolean tomato) {
            this.tomato = tomato;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }


}
