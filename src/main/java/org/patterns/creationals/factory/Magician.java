package org.patterns.creationals.factory;

public class Magician implements Enemy{
    String name;
    public Magician(String name){
        this.name = name;
    }
    @Override
    public void attack(){
        System.out.println(name +" Magician Attacks!");
    }
}
