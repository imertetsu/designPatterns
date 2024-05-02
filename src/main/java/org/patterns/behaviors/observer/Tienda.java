package org.patterns.behaviors.observer;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private List<Observador> observadores = new ArrayList<>();
    private boolean televisorDisponible = false;

    public void registrarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.actualizar("El televisor que esperabas ya está disponible en inventario.");
        }
    }

    public void setTelevisorDisponible(boolean disponible) {
        this.televisorDisponible = disponible;
        if (this.televisorDisponible) {
            notificarObservadores();
        }
    }
}
