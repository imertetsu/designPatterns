package org.strings;

import java.util.Objects;

public class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static void main(String[] args) {
        Person daniel = new Person(96369, "daniel", 35);
        Person juan = new Person(96362, "daniel", 35);

        System.out.println(daniel.equals(juan));
        System.out.println(daniel.hashCode());
        System.out.println(juan.hashCode());
    }
}
