package practice.designpatterns.strategy;

public class App {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();
        paymentContext.setPaymentStrategy(new CreditCardPayment());
        paymentContext.makePayment(200);

        PaymentContext paymentContext2 = new PaymentContext();
        paymentContext2.setPaymentStrategy(new PaypalPayment());
        paymentContext2.makePayment(500);
    }
}
/*
✔ WHEN to use:
   - When you have multiple algorithms for a task and want to switch them dynamically
   - To avoid using many `if-else` or `switch` statements
   - When behavior should be configurable at runtime

✔ WHERE to use:
   - Payment methods, sorting strategies, compression algorithms
   - Validation strategies (e.g., password, username)
   - Pathfinding in games (different movement strategies)
   - Dependency injection of business logic
*/
