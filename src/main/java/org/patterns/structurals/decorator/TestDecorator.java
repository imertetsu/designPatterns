package org.patterns.structurals.decorator;

public class TestDecorator {
    public static void main(String[] args) {
        Coffe coffe = new SimpleCoffe();
        Coffe milkCoffe = new MilkDecorator(coffe);
        System.out.println("Ingredients: "+ milkCoffe.getIngredients() + "Price: "+ milkCoffe.getPrice());

        Coffe sugarMilkCoffe = new SugarDecorator(milkCoffe);
        System.out.println("Ingredients: "+ sugarMilkCoffe.getIngredients() + "Price: "+ sugarMilkCoffe.getPrice());

    }
}
