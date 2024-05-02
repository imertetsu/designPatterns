package org.patterns.behaviors.observer;

public class TestObserver {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        Observador cliente1 = new Cliente("Cliente1");
        Observador cliente2 = new Cliente("Cliente2");

        tienda.registrarObservador(cliente1);
        tienda.registrarObservador(cliente2);

        // Simulación: el televisor aún no está disponible
        tienda.setTelevisorDisponible(false);

        // Simulación: el televisor llega al inventario
        tienda.setTelevisorDisponible(true);
    }
}
