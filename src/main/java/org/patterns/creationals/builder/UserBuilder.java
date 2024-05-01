package org.patterns.creationals.builder;

public class UserBuilder {
    public String name;
    public String email;
    public String phone;

    public UserBuilder(String name){
        this.name = name;
    }

    public UserBuilder setEmail(String email){
        this.email = email;
        return this;
    }

    public UserBuilder setPhone(String phone){
        this.phone = phone;
        return this;
    }

    public User build(){
        return new User(this);
    }
}
