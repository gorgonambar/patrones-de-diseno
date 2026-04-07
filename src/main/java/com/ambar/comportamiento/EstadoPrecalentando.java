package com.ambar.comportamiento;

public class EstadoPrecalentando implements EstadoHorno{
    @Override
    public void iniciarCoccion(Horno horno) {
        System.out.println("Aviso: El horno ya esta iniciado");
    }
    
    @Override
    public void alcanzarTemperatura(Horno horno) {
        System.out.println("Temperatura lista. Empezando a hornear");
        horno.setEstado(new EstadoHorneando());
    }
    
    @Override
    public void terminarTiempo(Horno horno) {
        System.out.println("Aviso: Aun no hay comida dentro del horno");
        
    }
    
    @Override
    public void cancelar(Horno horno) {
        System.out.println("Cancelado");
        horno.setEstado(new EstadoApagado());
    }
    
    @Override
    public void retirarComida(Horno horno) {
        System.out.println("Aviso: El horno solo se esta precalentando");
    }
}
