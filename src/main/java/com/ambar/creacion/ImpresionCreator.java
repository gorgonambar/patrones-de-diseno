package com.ambar.creacion;

public abstract class ImpresionCreator {
    //Factory Method
    protected abstract Impresion crearImpresion();
    
    //Logica en comun que tienen todas las impresiones
    public void generarImpresion(){
        Impresion impresion = crearImpresion();
        impresion.imprimir();
    }
}
