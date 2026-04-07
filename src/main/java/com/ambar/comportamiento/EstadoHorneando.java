package com.ambar.comportamiento;

public class EstadoHorneando implements EstadoHorno{
    @Override
    public void iniciarCoccion(Horno horno) {
        System.out.println("Aviso: El horno ya esta cocinando");
    }
    
    @Override
    public void alcanzarTemperatura(Horno horno) {
        System.out.println("Aviso: Ya se ha alcanzado la temperatura deseada");
    }
    
    @Override
    public void terminarTiempo(Horno horno) {
        System.out.println("Comida lista. Puedes retirarla del horno");
        horno.setEstado(new EstadoFinalizado());
    }
    
    @Override
    public void cancelar(Horno horno) {
        System.out.println("Coccion cancelada. Apagando");
        horno.setEstado(new EstadoApagado());
    }
    
    @Override
    public void retirarComida(Horno horno) {
        System.out.println("Aviso: EL tiempo de coccion aun no es suficiente");
    }
}
