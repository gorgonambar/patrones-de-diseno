package com.ambar.estructura;

public class GestionCupos {
    public boolean hayLugarDisponible(String materia){
        System.out.println("Cupos: Revistando disponibilidad para materia: "+ materia);
        return true;
    }
    public void asignarAsiento(String idAlumno, String materia){
        System.out.println("Cupos: Asiento asignado con exito al alumno " + idAlumno+ ", para la materia " + materia);
    }
}
