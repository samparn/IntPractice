package practice.designpatterns.factory;

public class SMS implements Notification {
    @Override
    public void send() {
        System.out.println("SMS Notification");
    }
}
