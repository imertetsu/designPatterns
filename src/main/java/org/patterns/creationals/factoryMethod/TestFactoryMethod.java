package org.patterns.creationals.factoryMethod;

public class TestFactoryMethod {
    public static void main(String[] args){
        EnemyFactory enemyFactory = new WarriorFactory();
        Enemy warrior = enemyFactory.createEnemy("Troll");
        EnemyFactory enemyFactory1 = new MagicianFactory();
        Enemy magician = enemyFactory1.createEnemy("Rubick");
        warrior.attack();
        magician.attack();
    }
}
