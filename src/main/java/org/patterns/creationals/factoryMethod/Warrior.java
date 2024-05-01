package org.patterns.creationals.factoryMethod;

public class Warrior implements Enemy {
    String name;
    public Warrior(String name){
        this.name = name;
    }
    @Override
    public void attack() {
        System.out.println(name + " Warrior attacks!");
    }
}
