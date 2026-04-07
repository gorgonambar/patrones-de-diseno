package com.ambar.estructura;

public class MainEstructura {
    public static void main(String[] args) {
        System.out.println("Patron de Estructura");
        // Instanciamos únicamente la fachada
        FacadeInscripcion fachada = new FacadeInscripcion();
        
        System.out.println("Alumno haciendo clic en 'Inscribirse'...");
        
        // Llamamos al método simple
        boolean exito = fachada.inscribir("ALU-1234", "Análisis Matemático");
        
        // Mostramos el resultado final en la interfaz
        System.out.println("\n--- RESULTADO EN LA APP DEL ALUMNO ---");
        if (exito) {
            System.out.println(" ¡Genial! Ya estás inscripto en la materia.");
        } else {
            System.out.println(" Lo sentimos, no pudimos procesar tu inscripción. Acércate a bedelía.");
        }
    }
}