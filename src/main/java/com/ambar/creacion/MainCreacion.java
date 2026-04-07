package com.ambar.creacion;

public class MainCreacion{
    public static void main(String[] args) {
        System.out.println("---------Patron de creacion---------");
        ImpresionCreator impresionCuaderno = new ImpresionCuadernoCreator();
        impresionCuaderno.generarImpresion();
        
        ImpresionCreator impresionFolleto = new ImpresionFolletoCreator();
        impresionFolleto.generarImpresion();
        
        ImpresionCreator impresionRevista = new ImpresionRevistaCreator();
        impresionRevista.generarImpresion();
        
    }
}