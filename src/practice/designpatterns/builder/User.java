package practice.designpatterns.builder;

public class User {
    private String name;
    private String email;
    private String phone;
    private String address;

    private User(UserBuilder builder) {
        this.address = builder.address;
        this.name = builder.name;
        this.email = builder.email;
        this.phone = builder.phone;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
    }

    // Static nested Builder class
    public static class UserBuilder {
        private String name;
        private String email;
        private String phone;
        private String address;

        public UserBuilder() {
        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder setAddress(String add) {
            this.address = add;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
