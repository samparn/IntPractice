package practice.designpatterns.abstractfactory;

public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {

        System.out.println("Windows Checkbox");
    }
}
