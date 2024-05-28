package org.patterns.creationals.abstractFactory;

public class SofaVictorian implements Sofa{
    @Override
    public String getSize() {
        return "SofaVictorian My size is... ";
    }

    @Override
    public String getColor() {
        return "SofaVictorian My color is... ";
    }
}
