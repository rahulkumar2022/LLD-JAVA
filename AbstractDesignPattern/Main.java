package AbstractDesignPattern;

public class Main {
    public static void main(String[] args) {
        Application app = new Application(new WindowsUIFactory());
        app.paint();
        app = new Application(new MacUIFactory());
        app.paint();
    }
}
