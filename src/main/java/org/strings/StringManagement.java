package org.strings;

public class StringManagement {
    public static void main(String[] args){

        String cad = new String("Hello");
        String cad1 = new String("Hello");
        String cad2 = "Hello";
        String cad3 = "Hello";

        changeStringValue(cad, cad2);
        System.out.println(cad + cad2);

        System.out.println(1+2+3+"welcome"+5+6);
    }

    public static void changeStringValue(String cad1, String cad2){
        cad1 = "Welcome";
        cad2 = "Welcome";
    }
}
