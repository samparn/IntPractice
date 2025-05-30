package practice.designpatterns.observer;

public class App {
    public static void main(String[] args){
        UserProfile userProfile = new UserProfile();
        Observer email = new EmailService();
        Observer sms = new SMSService();

        userProfile.addObserver(email);
        userProfile.addObserver(sms);
        userProfile.updateProfile();
    }
}
/*
✔ WHEN to use:
   - When multiple objects need to react to state changes in another object
   - When you want to avoid tight coupling between classes

✔ WHERE to use:
   - Event systems (e.g., button click listeners)
   - Messaging or notification systems
   - Real-time updates (stock prices, weather updates)
   - MVC frameworks (View observes Model)
   - Publish/Subscribe systems (Kafka, RabbitMQ, etc.)
*/
