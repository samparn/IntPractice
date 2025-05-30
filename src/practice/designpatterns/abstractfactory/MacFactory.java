package practice.designpatterns.abstractfactory;

public class MacFactory implements UIFactory{
    @Override
    public Button createButton() {

        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {

        return new MacCheckbox();
    }
}
