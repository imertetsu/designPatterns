package org.patterns.creationals.builder;

public class User {
    private String name;
    private String email;
    private String phone;

    private User(UserBuilder userBuilder){
        this.name = userBuilder.name;
        this.email = userBuilder.email;
        this.phone = userBuilder.phone;
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public static class UserBuilder {
        public String name;
        public String email;
        public String phone;

        public UserBuilder setName(String name){
            this.name = name;
            return this;
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
}

