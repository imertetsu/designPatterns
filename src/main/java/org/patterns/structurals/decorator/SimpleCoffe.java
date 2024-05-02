package org.patterns.structurals.decorator;

public class SimpleCoffe implements Coffe{
    @Override
    public double getPrice() {
        return 5.0;
    }

    @Override
    public String getIngredients() {
        return "Coffe, ";
    }
}
