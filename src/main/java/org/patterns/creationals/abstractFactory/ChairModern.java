package org.patterns.creationals.abstractFactory;

public class ChairModern implements Chair{
    @Override
    public String getSize() {
        return "ChairModern My size is... ";
    }

    @Override
    public String getColor() {
        return "ChairModern My color is... ";
    }
}
