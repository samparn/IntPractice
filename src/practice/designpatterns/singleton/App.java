package practice.designpatterns.singleton;

public class App {
    public static void main(String[] args){
        MySingleton singleton = MySingleton.getInstance();
        singleton.showMessage();
    }
}

/*
✔ WHEN to use:
   - When you need exactly one instance of a class.
   - When creating the object is costly (e.g., DB connection, config loader).
   - When shared access to the same instance is required.

✔ WHERE to use:
   - Configuration Manager (shared app settings)
   - Logger service (log messages globally)
   - Database connection pool manager
   - Caching service or Session manager
   - Thread pool executor (ExecutorService)
*/
