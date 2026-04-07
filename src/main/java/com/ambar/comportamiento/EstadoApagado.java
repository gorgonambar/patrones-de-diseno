package com.ambar.comportamiento;

public class EstadoApagado implements EstadoHorno{
    
    @Override
    public void iniciarCoccion(Horno horno) {
        System.out.println("Encendiendo.. Comenzando a calentar");
        horno.setEstado(new EstadoPrecalentando());
    }
    
    @Override
    public void alcanzarTemperatura(Horno horno) {
        System.out.println("Aviso: El horno está apagado");
    }
    
    @Override
    public void terminarTiempo(Horno horno) {
        System.out.println("Aviso: El horno esta apagado");
    }
    
    @Override
    public void cancelar(Horno horno) {
        System.out.println("Aviso: El horno ya esta apagado");
    }
    
    @Override
    public void retirarComida(Horno horno) {
        System.out.println("Aviso: No hay nada dentro");
    }
}
