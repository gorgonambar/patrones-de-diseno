package com.ambar.creacion;

public class ImpresionCuadernoCreator extends ImpresionCreator{
    @Override
    protected Impresion crearImpresion() {
        return new ImpresionCuaderno();
    }
}
