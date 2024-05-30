package org.patterns.creationals.abstractFactory;

public class TestAbstractFactory {
    public static void main(String[] args) {
        FurnitureFactory factory = new FurnitureModernFactory();
        Sofa modernSofa = factory.createSofa();
        Chair modernChair = factory.createChair();
        //System.out.println(modernSofa.getColor());
        //System.out.println(modernChair.getSize());

        factory = new FurnitureVictorianFactory();
        Sofa victorianSofa = factory.createSofa();
        Chair victorianChair = factory.createChair();
        //System.out.println(victorianSofa.getColor());
        //System.out.println(victorianChair.getSize());
    }
}
