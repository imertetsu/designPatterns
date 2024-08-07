package org.poo.polymorphism;

public class Square extends Figure{

    @Override
    public int calculateArea(int side) {
        return side * side;
    }

    public int calculatePerimeter(int side){
        return 4* side;
    }
    public double calculatePerimeter(double side){
        return 4 * side;
    }

    public static void main(String[] args) {
        Figure square = new Square();
        System.out.println(square.calculateArea(4));
    }
}
