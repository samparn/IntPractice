package practice.designpatterns.factory;

public class App {
    public static void main(String[] args) {
        Notification notification1 = NotificationFactory.getNotification("SMS");
        notification1.send();
        Notification notification2 = NotificationFactory.getNotification("EMAIL");
        notification2.send();
    }
}

/*
✔ WHEN to use:
   - When object creation logic depends on input or configuration.
   - When you want to avoid 'new' keyword spread across code.
   - When you may add new types in future (Open/Closed Principle).

✔ WHERE to use:
   - Notification services (Email, SMS, Push)
   - Payment gateway selection (Stripe, PayPal)
   - Shape/Document/Parser creation in UI or backend
   - DB Driver selection or Message handler selection
*/