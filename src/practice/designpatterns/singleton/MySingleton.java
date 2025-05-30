package practice.designpatterns.singleton;

public class MySingleton {
    private MySingleton() {
    }

    private static MySingleton instance = new MySingleton();

    public static MySingleton getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Testing Singleton");
    }
}
