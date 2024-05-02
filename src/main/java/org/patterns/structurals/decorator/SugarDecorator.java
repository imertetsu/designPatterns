package org.patterns.structurals.decorator;

public class SugarDecorator extends CoffeDecorator{
    public SugarDecorator(Coffe coffeDecorated) {
        super(coffeDecorated);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1.0;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + "Sugar, ";
    }
}
