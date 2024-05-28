package org.patterns.creationals.abstractFactory;

public class FurnitureVictorianFactory extends FurnitureFactory{
    @Override
    Sofa createSofa() {
        System.out.println("New Victorian Sofa created!");
        return new SofaVictorian();
    }

    @Override
    Chair createChair() {
        System.out.println("New Victorian Chair created!");
        return new ChairVictorian();
    }
}
