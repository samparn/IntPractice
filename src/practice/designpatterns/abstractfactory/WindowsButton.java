package practice.designpatterns.abstractfactory;

public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("Windows Button");
    }
}
