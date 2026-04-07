package com.ambar.creacion;

public class ImpresionFolletoCreator extends ImpresionCreator{
    @Override
    protected Impresion crearImpresion() {
        return new ImpresionFolleto();
    }
}
