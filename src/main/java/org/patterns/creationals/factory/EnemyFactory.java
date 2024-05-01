package org.patterns.creationals.factory;

public class EnemyFactory {
    public Enemy createEnemy(String enemy, String name){
        if(enemy.equalsIgnoreCase("warrior")){
            return new Warrior(name);
        }else if(enemy.equalsIgnoreCase("magician")) {
            return new Magician(name);
        }else {
            return null;
        }
    }
}
