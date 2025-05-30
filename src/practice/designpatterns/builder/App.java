package practice.designpatterns.builder;

public class App {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setName("Samparn")
                .setAddress("Pune")
                .setEmail("www")
                .setPhone("911")
                .build();
        user.showInfo();
    }
}

/*
✔ WHEN to use:
   - When object has many optional fields or configurations
   - When using long constructors with many parameters becomes confusing
   - When you want code that’s more readable and maintainable

✔ WHERE to use:
   - Building complex models (User, Product, Report, etc.)
   - Creating HTTP requests (e.g., Request.Builder in OkHttp)
   - Constructing database queries or configuration objects
   - In frameworks like Lombok (@Builder), Spring, Retrofit, etc.
*/

