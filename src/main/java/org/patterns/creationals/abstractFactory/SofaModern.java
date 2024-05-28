package org.patterns.creationals.abstractFactory;

public class SofaModern implements Sofa{
    @Override
    public String getSize() {
        return "SofaModern My size is... ";
    }

    @Override
    public String getColor() {
        return "SofaModern My color is... ";
    }
}
