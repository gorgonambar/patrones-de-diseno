package com.ambar.comportamiento;

public class MainComportamiento {
    public static void main(String[] args) {
        System.out.println("Patron de comportamiento State");
        
        Horno miHorno = new Horno();
        
        System.out.println("--- INICIANDO SIMULACIÓN DE HORNEADO ---");
        
        // 1. Iniciamos
        miHorno.iniciarCoccion();
        
        // 2. Alcanza la temperatura
        miHorno.alcanzarTemperatura();
        
//        // 3. Intentamos iniciar de nuevo (Prueba de error)
        miHorno.iniciarCoccion();
        
        // 4. Termina el tiempo
        miHorno.terminarTiempo();
        
        // 5. Retiramos la comida
        miHorno.retirarComida();
        
        System.out.println("--- SIMULACIÓN FINALIZADA ---");
        
    }
}