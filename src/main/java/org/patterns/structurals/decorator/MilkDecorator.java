package org.patterns.structurals.decorator;

public class MilkDecorator extends CoffeDecorator{
    public MilkDecorator(Coffe coffeDecorated){
        super(coffeDecorated);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2.5;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + "Milk, ";
    }
}
