package org.poo.inheritance;

public abstract class Animal {
    protected String name;
    protected String skill;
    protected String sound;

    public Animal(String name, String skill, String sound){
        this.name = name;
        this.skill = skill;
        this.sound = sound;
    }

    protected void emitSound(){
        System.out.println("Animal sound: " + sound);
    }

    protected void setName(String name){
        this.name = name;
        System.out.println("My name is: " + name);
    }
}
