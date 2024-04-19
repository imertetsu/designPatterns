package org.patterns.factoryMethod;

public class WarriorFactory extends EnemyFactory{
    @Override
    public Enemy createEnemy(String name) {
        return new Warrior(name);
    }
}
