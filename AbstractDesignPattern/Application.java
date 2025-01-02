package AbstractDesignPattern;

public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(UIFactory factory) {
        button = factory.createButton();
        checkBox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkBox.paint();
    }
}
