package org.patterns.creationals.builder;

public class BuilderTest {
    public static void main(String[] args){
        User user = new User.UserBuilder()
                .setName("Pedro")
                .setEmail("example@gmail.com")
                .build();
        System.out.println(user.toString());
    }
}
