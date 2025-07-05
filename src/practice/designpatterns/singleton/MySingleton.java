package practice.designpatterns.singleton;

public class MySingleton {
    private MySingleton() {
    }

    private static final MySingleton MY_INSTANCE = new MySingleton();

    public static MySingleton getInstance() {
        return MY_INSTANCE;
    }

    public void showMessage() {
        System.out.println("Testing Singleton");
    }
}
