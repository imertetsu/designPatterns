package org.patterns.factory;

import org.patterns.factory.Enemy;
import org.patterns.factory.EnemyFactory;

public class TestFactory {
    public static void main(String[] args) {
        EnemyFactory enemyFactory = new EnemyFactory();
        Enemy warrior = enemyFactory.createEnemy("warrior", "Ursa");
        Enemy magician = enemyFactory.createEnemy("magician", "Invoker");
        warrior.attack();
        magician.attack();
    }
}