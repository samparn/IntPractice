package practice.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class UserProfile implements Subject{

    private List<Observer> observers = new ArrayList<>();
    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for(Observer o : observers){
            o.update(message);
        }
    }

    public void updateProfile(){
        System.out.println("User Profile Updated");
        notifyObservers("User Updated his profile");
    }
}
