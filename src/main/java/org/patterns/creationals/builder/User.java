package org.patterns.creationals.builder;

public class User {
    private String name;
    private String email;
    private String phone;

    public User(UserBuilder userBuilder){
        this.name = userBuilder.name;
        this.email = userBuilder.email;
        this.phone = userBuilder.phone;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
