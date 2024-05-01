package org.patterns.creationals.builder;

public class BuilderTest {
    public static void main(String[] args){
        User user = new UserBuilder("Pedro")
                .setEmail("example@gmail.com")
                .setPhone("83289191")
                .build();

        User user2 = new User(new UserBuilder("Carlos"));

    }
}
