package org.poo.inheritance;

public class Dog extends Animal{
    public Dog(String name, String skill, String sound){
        super(name, skill, sound);
    }

    public void emitSound(){
        super.emitSound();
    }
}
