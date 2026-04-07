package com.ambar.comportamiento;

public class Horno {
    private EstadoHorno estadoActual;
    
    public Horno() {
        //estado inicial
        this.estadoActual = new EstadoApagado();
    }
    
    public void setEstado(EstadoHorno nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }
    
    // Delegación de responsabilidades al estado actual
    public void iniciarCoccion() {
        estadoActual.iniciarCoccion(this);
    }
    
    public void alcanzarTemperatura() {
        estadoActual.alcanzarTemperatura(this);
    }
    
    public void terminarTiempo() {
        estadoActual.terminarTiempo(this);
    }
    
    public void cancelar() {
        estadoActual.cancelar(this);
    }
    
    public void retirarComida() {
        estadoActual.retirarComida(this);
    }
}