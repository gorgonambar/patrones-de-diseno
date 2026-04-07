package com.ambar.comportamiento;


public class EstadoFinalizado implements EstadoHorno{
    @Override
    public void iniciarCoccion(Horno horno) {
        System.out.println("Aviso:Debes quitar la comida anterior");
    }
    
    @Override
    public void alcanzarTemperatura(Horno horno) {
        System.out.println("Aviso: La coccion ya termino");
    }
    
    @Override
    public void terminarTiempo(Horno horno) {
        
        System.out.println("Aviso: La coccion ya termino");
    }
    
    @Override
    public void cancelar(Horno horno) {
        System.out.println("Apagando horno");
        horno.setEstado(new EstadoApagado());
    }
    
    @Override
    public void retirarComida(Horno horno) {
        System.out.println("Comida servida. El horno se apaga automaticamente");
        horno.setEstado(new EstadoApagado());
    }
    
}
