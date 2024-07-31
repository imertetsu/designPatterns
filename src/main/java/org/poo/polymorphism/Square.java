package org.poo.polymorphism;

public class Square extends Figure{

    @Override
    public int calculateArea(int side) {
        return side * side;
    }

    public static void main(String[] args) {
        Figure square = new Square();
        System.out.println(square.calculateArea(4));
    }
}
