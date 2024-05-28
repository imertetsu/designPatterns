package org.patterns.creationals.abstractFactory;

public class FurnitureModernFactory extends FurnitureFactory{
    @Override
    Sofa createSofa() {
        System.out.println("New Modern Sofa created!");
        return new SofaModern();
    }
    @Override
    Chair createChair() {
        System.out.println("New Modern Chair created!");
        return new ChairModern();
    }
}
