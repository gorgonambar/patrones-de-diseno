package com.ambar.creacion;

public class ImpresionRevistaCreator extends ImpresionCreator{
    @Override
    protected Impresion crearImpresion() {
        return new impresionRevista();
    }
}
