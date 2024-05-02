package org.patterns.structurals.decorator;

public abstract class CoffeDecorator implements Coffe {
    public Coffe coffeDecorated;
    public CoffeDecorator(Coffe coffeDecorated){
        this.coffeDecorated = coffeDecorated;
    }
    @Override
    public double getPrice() {
        return this.coffeDecorated.getPrice();
    }

    @Override
    public String getIngredients() {
        return this.coffeDecorated.getIngredients();
    }
}
