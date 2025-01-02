package AbstractDesignPattern;

public class MacUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new MacOSCheckBox();
    }
    
}
