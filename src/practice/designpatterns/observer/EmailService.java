package practice.designpatterns.observer;

public class EmailService implements  Observer{

    @Override
    public void update(String message) {
        System.out.println("EMAIL Notification" + message);
    }
}
