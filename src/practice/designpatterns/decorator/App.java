package practice.designpatterns.decorator;

public class App {
    public static void main ( String[] args){
        Coffee coffee = new BasicCoffee();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription());
        System.out.println(coffee.getCost());
    }
}
/*
✔ WHEN to use:
   - When you want to add behavior without altering original class
   - When you want to avoid a large number of subclasses for combinations
   - When responsibilities should be added at runtime

✔ WHERE to use:
   - UI components (scroll bars, borders on windows)
   - Java I/O classes (BufferedReader, FileInputStream)
   - Logging frameworks (adding timestamps, formatting)
   - Text formatting (bold, italic, underline decorators)
*/
