package practice.designpatterns.factory;

public class NotificationFactory {
    public static Notification getNotification(String type){
        if(type == null) return null;
        if(type.equals("EMAIL")){
            return new EmailNotification();
        }
        if(type.equals("SMS")){
            return new SMS();
        }
        return null;
    }
}
