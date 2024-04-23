package org.patterns.abstractFactory;

public class HeavyArmor implements Armor{
    @Override
    public void protect() {
        System.out.println("Heavy Armor protect!");
    }
}
