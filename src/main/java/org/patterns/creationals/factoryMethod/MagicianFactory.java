package org.patterns.creationals.factoryMethod;

public class MagicianFactory extends EnemyFactory{
    @Override
    public Enemy createEnemy(String name) {
        return new Magician(name);
    }
}
