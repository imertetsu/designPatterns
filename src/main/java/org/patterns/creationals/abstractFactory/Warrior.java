package org.patterns.creationals.abstractFactory;

public class Warrior implements Enemy{
    @Override
    public void attack() {
        System.out.println("Warrior attack!");
    }
}
