package practice.designpatterns.template;

public class App {
    public static void main(String[] args) {
        Beverage tea = new Tea();
        System.out.println("Making tea:");
        tea.prepare();

        System.out.println();

        Beverage coffee = new Coffee();
        System.out.println("Making coffee:");
        coffee.prepare();
    }
}
/*
✔ WHEN to use:
   - When multiple classes follow the same overall process but differ in some steps
   - When you want to avoid code duplication across related classes

✔ WHERE to use:
   - UI frameworks (e.g., form templates with different fields)
   - Game engines (game loop logic with specific rendering)
   - Data parsers (CSV, XML, JSON parsers with common workflow)
   - Build tools (e.g., Maven build lifecycle)
*/
