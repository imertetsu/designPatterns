package org.patterns.creationals.abstractFactory;

public class ChairVictorian implements Chair{
    @Override
    public String getSize() {
        return "ChairVictorian My size is... ";
    }

    @Override
    public String getColor() {
        return "ChairVictorian My color is... ";
    }
}
