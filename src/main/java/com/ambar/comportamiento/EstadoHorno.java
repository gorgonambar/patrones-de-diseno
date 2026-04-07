package com.ambar.comportamiento;

public interface EstadoHorno {
    void iniciarCoccion(Horno horno);
    void alcanzarTemperatura(Horno horno);
    void terminarTiempo(Horno horno);
    void cancelar(Horno horno);
    void retirarComida(Horno horno);
    
}
