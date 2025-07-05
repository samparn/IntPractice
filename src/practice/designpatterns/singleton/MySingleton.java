package practice.designpatterns.singleton;

//Bill Pugh Singleton
public class MySingleton {
    private MySingleton() {
    }
    private static class Holder {
    private static final MySingleton MY_INSTANCE = new MySingleton();
    }

    public static MySingleton getInstance() {
        return Holder.MY_INSTANCE;
    }

    public void showMessage() {
        System.out.println("Testing Singleton");
    }
}
