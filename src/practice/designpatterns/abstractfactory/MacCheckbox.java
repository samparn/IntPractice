package practice.designpatterns.abstractfactory;

public class MacCheckbox implements Checkbox {

    @Override
    public void paint() {

        System.out.println("Mac Checkbox");
    }
}
