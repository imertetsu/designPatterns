package org.genericos;

public class Contenedor<T> {
    private T objeto;

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }

    public T getObjeto() {
        return objeto;
    }

    public static void main(String[] args) {
        Contenedor<String> contenedorString = new Contenedor<>();
        contenedorString.setObjeto("Hola Mundo");
        String str = contenedorString.getObjeto();
        System.out.println(str);

        Contenedor<Integer> contenedorInteger = new Contenedor<>();
        contenedorInteger.setObjeto(123);
        int entero = contenedorInteger.getObjeto();
        System.out.println(entero);
    }
}

