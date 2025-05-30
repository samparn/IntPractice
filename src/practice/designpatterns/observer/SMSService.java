package practice.designpatterns.observer;

public class SMSService implements  Observer{

    @Override
    public void update(String message) {

        System.out.println("SMS Notification" + message);
    }
}
