package com.ambar.estructura;

public class FacadeInscripcion {
    private SistemaFinanzas finanzas;
    private SistemaCorrelativas correlativas;
    private GestionCupos cupos;
    
    public FacadeInscripcion() {
        this.finanzas = new SistemaFinanzas();
        this.correlativas = new SistemaCorrelativas();
        this.cupos = new GestionCupos();
    }
    
    // Metodo que conoce el cliente
    public boolean inscribir(String idAlumno, String materia) {
        System.out.println("--- INICIANDO PROCESO INTERNO DE INSCRIPCIÓN ---");
        
        // 1. Verificamos finanzas
        if (finanzas.verificarDeuda(idAlumno)) {
            System.out.println("Inscripción rechazada: El alumno registra deuda.");
            return false;
        }
        
        // 2. Verificamos correlativas
        if (!correlativas.tieneCorrelativasAprobadas(idAlumno, materia)) {
            System.out.println("Inscripción rechazada: Faltan correlativas por aprobar.");
            return false;
        }
        
        // 3. Verificamos si hay cupo
        if (!cupos.hayLugarDisponible(materia)) {
            System.out.println("Inscripción rechazada: No hay cupos disponibles.");
            return false;
        }
        
        // Si superó todas las validaciones, procedemos a asignar el asiento
        cupos.asignarAsiento(idAlumno, materia);
        
        System.out.println("--- PROCESO INTERNO FINALIZADO CON ÉXITO ---");
        return true;
    }
}
