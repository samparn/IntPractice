package practice.designpatterns.facade;

public class TV {

    public void on() {
        System.out.println("TV is ON");
    }

    public void setInput(String input) {
        System.out.println("TV input set to " + input);
    }
}
